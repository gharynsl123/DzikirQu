package com.gharin.dzikirqu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.gharin.dzikirqu.Adapter.AdapterDzikir;
import com.gharin.dzikirqu.Adapter.AdapterSetelahShalat;
import com.gharin.dzikirqu.Model.ModelDzikir;
import com.gharin.dzikirqu.Model.ModelSetelahShalat;

import java.util.ArrayList;

public class SetelahSholat extends AppCompatActivity {
    private AdapterSetelahShalat adapterSetelahShalat;
    RecyclerView rvMainSetelahShalat;
    ArrayList<ModelSetelahShalat> arrayList;

    private String[] idTv= {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
    };

    private String[] tvNo = {
            "[1]",
            "[2]",
            "[3]",
            "[4]",
            "[5]",
            "[6]",
            "[7]",
            "[8]",
            "(Baca Pada Waktu Subuh Saja)",



    };
    private String[] tvArab = {
            "أَسْتَغْفِرُ اللهَ (3x) اَللَّهُمَّ أَنْتَ السَّلاَمُ، وَمِنْكَ السَّلاَمُ، تَبَارَكْتَ يَا ذَا الْجَلاَلِ وَاْلإِكْرَامِ.",
            "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ، اَللَّهُمَّ لاَ مَانِعَ لِمَا أَعْطَيْتَ، وَلاَ مُعْطِيَ لِمَا مَنَعْتَ، وَلاَ يَنْفَعُ ذَا الْجَدِّ مِنْكَ الْجَدُّ",
            "اَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. لاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللهِ، لاَ إِلَـهَ إِلاَّ اللهُ، وَلاَ نَعْبُدُ إِلاَّ إِيَّاهُ، لَهُ النِّعْمَةُ وَلَهُ الْفَضْلُ وَلَهُ الثَّنَاءُ الْحَسَنُ، لاَ إِلَـهَ إِلاَّ اللهُ مُخْلِصِيْنَ لَهُ الدِّيْنَ وَلَوْ كَرِهَ الْكَافِرُوْنَ",
            "سُبْحَانَ اللهِ وَالْحَمْدُ لِلَّهِ وَاللهُ أَكْبَرُ (33 ×) لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ(33 ×) لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ(33 ×)",
            "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
            "قُلْ هُوَ اللَّهُ أَحَدٌ(١)اللَّهُ الصَّمَدُ (٢) لَمْ يَلِدْ وَلَمْ يُولَدْ (٣)وَلَمْ يَكُن لَّهُ كُفُوًا أَحَد(٤)  (٣x)ٌ",
            "قُلْ أَعُوذُ بِرَبِّ الْفَلَق(١)ِ مِن شَرِّ مَا خَلَق(٢)َ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ (٣)وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَد(٤)ِ  وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ(٥)  (٣x)",
            "قُلْ أَعُوذُ بِرَبِّ النَّاس(١)ِ مَلِكِ النَّاسِ (٢)إِلَهِ النَّاسِ(٣) مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ(٤) الَّذِي يُوَسْوِسُ فِي صُدُورِ(٥) النَّاسِ مِنَ الْجِنَّةِ وَ النَّاس(٦)  (٣x)ِ",
            " اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً",


    };
    private String[] tvArti = {
            "“Aku minta ampun kepada Allah,” (3x). Lantas membaca: “Ya Allah, Engkau pemberi keselamatan, dan dariMu keselamatan, Maha Suci Engkau, wahai Tuhan Yang Pemilik Keagungan dan Kemuliaan” (HR. Muslim no. 591).",
            "“Tiada Rabb yang berhak disembah selain Allah Yang Maha Esa, tidak ada sekutu bagiNya. BagiNya puji dan bagi-Nya kerajaan. Dia Maha Kuasa atas segala sesuatu. Ya Allah, tidak ada yang mencegah apa yang Engkau berikan dan tidak ada yang memberi apa yang Engkau cegah. Tidak berguna kekayaan dan kemuliaan itu bagi pemiliknya (selain iman dan amal shalihnya yang menyelamatkan dari siksaan). Hanya dari-Mu kekayaan dan kemuliaan” (HR. Bukhari no.6615, Muslim no.593).",
            "“Tiada Rabb (yang berhak disembah) kecuali Allah, Yang Maha Esa, tidak ada sekutu bagiNya. BagiNya kerajaan dan pujaan. Dia Mahakuasa atas segala sesuatu. Tidak ada daya dan kekuatan kecuali (dengan pertolongan) Allah. Tiada Rabb (yang hak disembah) kecuali Allah. Kami tidak menyembah kecuali kepadaNya. Bagi-Nya nikmat, anugerah dan pujaan yang baik. Tiada Rabb (yang hak disembah) kecuali Allah, dengan memurnikan ibadah kepadaNya, sekalipun orang-orang kafir sama benci” (HR. Muslim, no. 594).",
            "“Maha Suci Allah, segala puji bagi Allah, dan Allah Maha Besar (33 x). Tidak ada Rabb (yang berhak disembah) kecuali Allah Yang Maha Esa,(33 ×) tidak ada sekutu bagiNya. BagiNya kerajaan. BagiNya pujaan. Dia-lah Yang Mahakuasa atas segala sesuatu”(33 ×) (HR. Muslim no. 597).",
            "Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar.”",
            "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” (QS. Al Ikhlas: 1-4) (Dibaca 3 x)",
            "Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki”. (QS. Al Falaq: 1-5) (Dibaca 3 x)",
            "Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia.” (QS. An Naas: 1-6) (Dibaca 3 x)",
            "“Ya Allah, sesungguhnya aku mohon kepadaMu ilmu yang bermanfaat, rezeki yang halal dan amal yang diterima.” (Dibaca setelah salam shalat Shubuh) (HR. Ibnu Majah no. 762, dishahihkan Al Albani dalam Shahih Ibni Majah).",



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setelah_sholat);
        setTitle("Dzikir Setelah Sholat");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        rvMainSetelahShalat= findViewById(R.id.rvMainSetelahSholat);
        arrayList = new ArrayList<>();
        adapterSetelahShalat = new AdapterSetelahShalat(arrayList);
        setDataSHalat();
        rvMainSetelahShalat.setAdapter(adapterSetelahShalat);
        rvMainSetelahShalat.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setDataSHalat() {
        int count = 0;
        for (String id : idTv) {
            arrayList.add(new ModelSetelahShalat(id, tvNo[count], tvArab[count], tvArti[count]));
            count++;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar_tasbih, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.tasbih:
                startActivity(new Intent(SetelahSholat.this, Tasbih.class));
                break;
            case R.id.DzikirLainnya:
                startActivity(new Intent(SetelahSholat.this, DzikirLain.class));
        }
        return super.onOptionsItemSelected(item);
    }
}

