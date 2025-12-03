package nezet;

import Model.Asztal;
import Model.Etel;
import java.util.ArrayList;

public class EtteremNezet {

    public void EtteremNezet(ArrayList<Asztal> asztalok) {
        
        for (Asztal a : asztalok) {
            System.out.println(a.getNev());
            System.out.println("-----------------------");

            for (Etel e : a.getEtelek()) {
                System.out.println(e.getNev() + " - " + e.getAr() + " Ft");
            }

            System.out.println("Összesen: " + a.osszeg() + " Ft");
            System.out.println();
        }
    }
}
