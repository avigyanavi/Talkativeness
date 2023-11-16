package com.avi.talkativeness;

public class ReadWriteUserDetails {
    public String age, gender, email;

    //Empty Constructor to obtain realtime data (snapshot) from the database
    public ReadWriteUserDetails(){};

    public ReadWriteUserDetails( String textAge, String textGender) {
        this.age = textAge;
        this.gender = textGender;
//        this.email = textEmail;
    }
}
