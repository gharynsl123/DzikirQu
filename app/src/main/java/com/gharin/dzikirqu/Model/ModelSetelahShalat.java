package com.gharin.dzikirqu.Model;

public class ModelSetelahShalat {
    private String id;
    private String tvNo;
    private String tvArab;
    private String tvArti;

    public ModelSetelahShalat(String id, String tvNo, String tvArab, String tvArti) {
        this.id = id;
        this.tvNo = tvNo;
        this.tvArab = tvArab;
        this.tvArti = tvArti;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
