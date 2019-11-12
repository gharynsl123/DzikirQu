package com.gharin.dzikirqu.Model;

public class ModelDzikir {
    private String tvNo;
    private String tvArab;
    private String tvArti;

    public ModelDzikir(String tvNo, String tvArab, String tvArti) {
        this.tvNo = tvNo;
        this.tvArab = tvArab;
        this.tvArti = tvArti;
    }

    public String getTvNo() {
        return tvNo;
    }

    public void setTvNo(String tvNo) {
        this.tvNo = tvNo;
    }

    public String getTvArab() {
        return tvArab;
    }

    public void setTvArab(String tvArab) {
        this.tvArab = tvArab;
    }

    public String getTvArti() {
        return tvArti;
    }

    public void setTvArti(String tvArti) {
        this.tvArti = tvArti;
    }
}
