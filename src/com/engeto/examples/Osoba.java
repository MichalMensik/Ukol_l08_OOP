package com.engeto.examples;

public class Osoba {
    private String jmeno;
    private String prijmeni;


    public Osoba() {
    }

    public Osoba(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni;
    }
}

