package com.example.bcaguidesnepal;

public class datamodel {
    int img;
    String subject, creditHr;

    public datamodel(int img, String subject, String creditHr) {
        this.img = img;
        this.subject = subject;
        this.creditHr = creditHr;

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCreditHr() {
        return creditHr;
    }

    public void setCreditHr(String creditHr) {
        this.creditHr = creditHr;
    }
}
