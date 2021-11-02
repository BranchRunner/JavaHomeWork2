package com.pb.bondarev.hw5;

public class Book {
    private String name;
    private String avt;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    String getInfo() {
        return "Назва книги: " + name + ", автор книги: " + avt + ", рік видання: " + year + "р.";
    }


}
