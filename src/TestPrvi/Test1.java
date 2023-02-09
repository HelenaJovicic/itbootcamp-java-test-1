package TestPrvi;

//1. Napraviti program koji, koristeci DO WHILE petlju,
// racuna proizvod unetih brojeva sve dok korisnik ne unese 0.
// Na kraju ispisati koliki je proizvod samo ako je veci od 10

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int unetBroj = 0;
        double proizvodUnetihBrojeva = 1;
        do {
            System.out.println("Unesite broj: ");
            unetBroj = sc.nextInt();

            if (unetBroj != 0) {
                proizvodUnetihBrojeva = proizvodUnetihBrojeva * unetBroj;
            }

        } while (unetBroj != 0);

        if (proizvodUnetihBrojeva > 10) {

            System.out.println("Proizvod unetih brojeva je: " + proizvodUnetihBrojeva);
        }


    }
}
