package com.engeto.examples;

public class Kolektiv extends Osoba {

    private static int nextId = 1;

    private int cisloRocniku;
    private String nazevTridy;
    private int rokNarozeni;
    private  String idStudenta;
    private int id;

    public Kolektiv(String jmeno, String prijmeni, int cisloRocniku, String nazevTridy,
                    int rokNarozeni, String idStudenta, int id) {
        super(jmeno, prijmeni);
        this.cisloRocniku = cisloRocniku;
        this.nazevTridy = nazevTridy;
        this.rokNarozeni = rokNarozeni;
        this.idStudenta = idStudenta;
        this.id = nextId++;
    }

    public Kolektiv() {
        super();
    }

    public void setCisloRocniku(int cisloRocniku){
        this.cisloRocniku = cisloRocniku;
    }

    public String getNazevTridy() {
        return nazevTridy;
    }

    public void setNazevTridy(String nazevTridy) {
        this.nazevTridy = nazevTridy;
    }

    public void setRokNarozeni(int rokNarozeni) {
        this.rokNarozeni = rokNarozeni;
    }

    public String getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(String idStudenta) {
        this.idStudenta = idStudenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifikaceTridy(){
        return "Třída: " + nazevTridy + " (ročník: " + cisloRocniku + ")";
    }

    public String getidStudenta2 (){
        return "# " + id +" # " + idStudenta;
    }

    public String getdatumNarozeni() {
        return " (" + rokNarozeni + ")";
    }
}