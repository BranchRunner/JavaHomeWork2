package com.pb.bondarev.hw5;

public class Reader {
    private String fio;
    private int numbil;
    private String fac;
    private String birt;
    private String numtel;
    private String kil;
    private String yaki;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumbil() {
        return numbil;
    }

    public void setNumbil(int numbil) {
        this.numbil = numbil;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public String getBirt() {
        return birt;
    }

    public void setBirt(String birt) {
        this.birt = birt;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public String getKil() {
        return kil;
    }

    public void setKil(String kil) {
        this.kil = kil;
    }

    public String getYaki() {
        return yaki;
    }

    public void setYaki(String yaki) {
        this.yaki = yaki;
    }

    String getInfoRe() {
        return "ПІБ - " + fio + ", номер квитка - " + numbil + ", факультет - " + fac + ", день народження - " + birt + ", номер телефону - " + numtel;
    }

    String takeBook() {
        String s1 = "Петров В.В. взяв " + kil + " книги";
        String s2 = "Петров В.В. взяв книги: " + yaki + ".";
        return s1 + ", " + s2;

    }


}
