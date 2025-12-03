package Model;

import java.util.ArrayList;
import java.util.List;

public class Asztal {
    private String nev;
    private ArrayList<Etel> etelek;

    public Asztal(String nev) {
        this.nev = nev;
        this.etelek = new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public List<Etel> getEtelek() {
        return etelek;
    }

    public void hozzaadEtel(Etel e) {
        etelek.add(e);
    }
}

