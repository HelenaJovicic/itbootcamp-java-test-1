package TestPrvi;
//4. Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu.
// Korisnik preko skenera unosi koji broj zeli da prebroji u nizu.

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int niz[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        //1 imam jednom
        //2 se javlja 2 puta
        //3 imam tri puta
        //4  imam cetiri puta
        //nemam druge brojeve koji se ne pojavljuju

        System.out.println("Unesite broj cije pojavljivanje u nizu se broji: ");
        int unetiBroj = sc.nextInt();
        int brojPojavljivanjaUnetogBroja = 0;
        //treba mi for petlja da izracunam broj pojavljivanja

        for (int i = 0; i < niz.length; i++) {
            if (unetiBroj == niz[i]) {
                brojPojavljivanjaUnetogBroja++;
            }
        }
        System.out.println("Uneti broj " + unetiBroj + " se pojavljuje " + brojPojavljivanjaUnetogBroja + " puta ");


    }
}
