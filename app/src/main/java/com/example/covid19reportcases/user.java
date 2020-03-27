package com.example.covid19reportcases;

public class user {

    private String  rpname;
    private String ptname;
    private String hnaddress;
    private  String phone;
    private String local;
    private  String stete;
    private String comment;

    public user(String rpname, String ptname, String hnaddress, String phone, String local, String stete, String comment) {
        this.rpname = rpname;
        this.ptname = ptname;
        this.hnaddress = hnaddress;
        this.phone = phone;
        this.local = local;
        this.stete = stete;
        this.comment = comment;
    }

    public String getRpname() {
        return rpname;
    }

    public void setRpname(String rpname) {
        this.rpname = rpname;
    }

    public String getPtname() {
        return ptname;
    }

    public void setPtname(String ptname) {
        this.ptname = ptname;
    }

    public String getHnaddress() {
        return hnaddress;
    }

    public void setHnaddress(String hnaddress) {
        this.hnaddress = hnaddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStete() {
        return stete;
    }

    public void setStete(String stete) {
        this.stete = stete;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public user() {


    }
}


