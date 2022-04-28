package com.engeto.examples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String INPUT_FILENAME = "Seznam_studentu.txt";

    public static void main(String[] args) {

        Kolektiv kolektiv = new Kolektiv();
        kolektiv.setCisloRocniku(4);
        kolektiv.setNazevTridy("4.C");

        System.out.println("#############################");
        System.out.println(kolektiv.getIdentifikaceTridy());


        Osoba ucitel = new Osoba("Jan", "Novák");
        Osoba prvni = new Osoba("Petr", "Svoboda");
        Osoba druha = new Osoba("Milan", "Říha");
        Osoba treti = new Osoba("Jindřich", "Nový");

        System.out.println("Třídní učitel: " + ucitel.getJmeno() + ", " + ucitel.getPrijmeni());


        List<Osoba> trida = new ArrayList<>();

        trida.add(prvni);
        trida.add(druha);
        trida.add(treti);

        System.out.println("Počet studentů: " + trida.size());
        System.out.println();
        System.out.println("#############################");

        Kolektiv kolektiv1 = new Kolektiv();
        kolektiv1.setId(1);
        kolektiv1.setIdStudenta("ID001");
        kolektiv1.setRokNarozeni(2011);

        System.out.println(kolektiv1.getidStudenta2() + " - " + prvni.getJmeno() + " " + prvni.getPrijmeni()
                + kolektiv1.getdatumNarozeni());

        Kolektiv kolektiv2 = new Kolektiv();
        kolektiv2.setId(2);
        kolektiv2.setIdStudenta("ID123");
        kolektiv2.setRokNarozeni(2010);

        System.out.println(kolektiv2.getidStudenta2() + " - " + druha.getJmeno() + " " + druha.getPrijmeni()
                + kolektiv2.getdatumNarozeni());

        Kolektiv kolektiv3 = new Kolektiv();
        kolektiv3.setId(3);
        kolektiv3.setIdStudenta("ID345");
        kolektiv3.setRokNarozeni(2012);

        System.out.println(kolektiv3.getidStudenta2() + " - " + treti.getJmeno() + " " + treti.getPrijmeni()
                + kolektiv3.getdatumNarozeni());

        System.out.println();
        System.out.println(kolektiv.getNazevTridy() + ", " + ucitel.getJmeno() + " " + ucitel.getPrijmeni());
        System.out.println(kolektiv1.getIdStudenta() + ", " + prvni.getJmeno() + " " + prvni.getPrijmeni());
        System.out.println(kolektiv2.getIdStudenta() + ", " + druha.getJmeno() + " " + druha.getPrijmeni());
        System.out.println(kolektiv3.getIdStudenta() + ", " + treti.getJmeno() + " " + treti.getPrijmeni());
        System.out.println();


        System.out.println("Třída: " + kolektiv.getNazevTridy());
        System.out.println("Seznam studentů:");
        System.out.println(kolektiv1.getId() + ". " + prvni.getPrijmeni() + " " + prvni.getJmeno());
        System.out.println(kolektiv2.getId() + ". " + druha.getPrijmeni() + " " + druha.getJmeno());
        System.out.println(kolektiv3.getId() + ". " + treti.getPrijmeni() + " " + treti.getJmeno());

        File ulozeni = new File(INPUT_FILENAME);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(ulozeni)));
                pw.println("Třída: " + kolektiv.getNazevTridy());
                pw.println("Seznam studentů:");
                pw.println(kolektiv1.getId() + ". " + prvni.getPrijmeni() + " " + prvni.getJmeno());
                pw.println(kolektiv2.getId() + ". " + druha.getPrijmeni() + " " + druha.getJmeno());
                pw.println(kolektiv3.getId() + ". " + treti.getPrijmeni() + " " + treti.getJmeno());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
            } catch (Exception ex) {
            }
        }
    }
}