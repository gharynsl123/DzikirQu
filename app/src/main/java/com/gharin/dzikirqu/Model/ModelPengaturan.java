package com.gharin.dzikirqu.Model;

public class ModelPengaturan {
    private String tvPengaturanid;
    private String tvJudul;
    private String tvKeterangan;
    private int ivPengaturan;

    public ModelPengaturan(String tvPengaturanid, String tvJudul, String tvKeterangan, int ivPengaturan) {
        this.tvPengaturanid = tvPengaturanid;
        this.tvJudul = tvJudul;
        this.tvKeterangan = tvKeterangan;
        this.ivPengaturan = ivPengaturan;
    }

    public String getTvPengaturanid() {
        return tvPengaturanid;
    }

    public void setTvPengaturanid(String tvPengaturanid) {
        this.tvPengaturanid = tvPengaturanid;
    }

    public String getTvJudul() {
        return tvJudul;
    }

    public void setTvJudul(String tvJudul) {
        this.tvJudul = tvJudul;
    }

    public String getTvKeterangan() {
        return tvKeterangan;
    }

    public void setTvKeterangan(String tvKeterangan) {
        this.tvKeterangan = tvKeterangan;
    }

    public int getIvPengaturan() {
        return ivPengaturan;
    }

    public void setIvPengaturan(int ivPengaturan) {
        this.ivPengaturan = ivPengaturan;
    }
}
