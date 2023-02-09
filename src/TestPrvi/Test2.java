package TestPrvi;

//2. Napraviti program koji nalazi najveci broj u listi
// i vraca informaciju da li je taj najveci broj paran


import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //brojeve ne unosim preko skenera
        ArrayList<Integer> listaBrojeva = new ArrayList<>();
        //neparne br
        listaBrojeva.add(1);
        listaBrojeva.add(3);
        listaBrojeva.add(5);
        listaBrojeva.add(7);
        listaBrojeva.add(9); //najveci br u listi
        //parni
        listaBrojeva.add(2);
        listaBrojeva.add(4);
        //uzimam prvi br da je najveci dok ne nadjem u listi br koji je veci od tog

        int najveciBroj = listaBrojeva.get(0);
        for (int i = 0; i < listaBrojeva.size(); i++) {
            //moram da uvedem uslov
            if (listaBrojeva.get(i) > najveciBroj) {
                najveciBroj = listaBrojeva.get(i);
            }

        }
        //treba da proverim da li je najveci br koji sam nasla paran ili neparan
        if (najveciBroj % 2 == 0) {

            System.out.println("Najveci broj u listi je " + najveciBroj + " i on je paran");

        } else {
            System.out.println("Najveci broj u listi je " + najveciBroj + " i on je neparan");
        }


    }
}
