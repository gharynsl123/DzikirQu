package com.gharin.dzikirqu.Model;

public class ModelHarian {
    private String idHarian;
    private String tvHarian;
    private int ivHarian;

    public ModelHarian(String idHarian, String tvHarian, int ivHarian) {
        this.idHarian = idHarian;
        this.tvHarian = tvHarian;
        this.ivHarian = ivHarian;
    }

    public String getIdHarian() {
        return idHarian;
    }

    public void setIdHarian(String idHarian) {
        this.idHarian = idHarian;
    }

    public String getTvHarian() {
        return tvHarian;
    }

    public void setTvHarian(String tvHarian) {
        this.tvHarian = tvHarian;
    }

    public int getIvHarian() {
        return ivHarian;
    }

    public void setIvHarian(int ivHarian) {
        this.ivHarian = ivHarian;
    }
}
