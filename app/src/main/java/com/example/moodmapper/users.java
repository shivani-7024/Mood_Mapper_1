package com.example.moodmapper;

public class users {

    String  usermail, userpassword;


    public users(String usermail, String userpassword) {

        this.usermail = usermail;
        this.userpassword = userpassword;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
}
