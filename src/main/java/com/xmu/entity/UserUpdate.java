package com.xmu.entity;

public class UserUpdate {
    /**
     * Only allows to update password and phone number from user side
     * */

    private long uId;
    private String uPhone;
    private String uPassword;

    public long getuId() {
        return uId;
    }

    public void setuId(long uId) {
        this.uId = uId;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

}