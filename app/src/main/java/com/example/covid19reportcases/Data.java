package com.example.covid19reportcases;

public class Data {

    private String  rpname;
    private String ptname;
    private String hnaddress;
    private  String phone;
    private String local;
    private  String stete;
    private String comment;

    public Data(String rpname, String ptname, String hnaddress, String phone, String local, String stete, String comment) {
        this.rpname = rpname;
        this.ptname = ptname;
        this.hnaddress = hnaddress;
        this.phone = phone;
        this.local = local;
        this.stete = stete;
        this.comment = comment;
    }

    public Data(){

    }

    public String getRpname() {
        return rpname;
    }

    public String getPtname() {
        return ptname;
    }

    public String getHnaddress() {
        return hnaddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocal() {
        return local;
    }

    public String getStete() {
        return stete;
    }

    public String getComment() {
        return comment;
    }
}
