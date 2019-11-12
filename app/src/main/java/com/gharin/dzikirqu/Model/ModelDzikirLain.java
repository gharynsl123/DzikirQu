package com.gharin.dzikirqu.Model;

public class ModelDzikirLain {

    private String idlist;
    private String tvlist;
    private int ivLauncher;

    public ModelDzikirLain(String idlist, String tvlist, int ivLauncher) {
        this.idlist = idlist;
        this.tvlist = tvlist;
        this.ivLauncher = ivLauncher;
    }

    public String getIdlist() {
        return idlist;
    }

    public void setIdlist(String idlist) {
        this.idlist = idlist;
    }

    public String getTvlist() {
        return tvlist;
    }

    public void setTvlist(String tvlist) {
        this.tvlist = tvlist;
    }

    public int getIvLauncher() {
        return ivLauncher;
    }

    public void setIvLauncher(int ivLauncher) {
        this.ivLauncher = ivLauncher;
    }
}
