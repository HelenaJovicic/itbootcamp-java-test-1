package TestPrvi;

//5. Napisati program koji racuna potrosnju goriva. Korisnik unosi distancu, tip vozila i tip goriva,
//a program ispisuje koliko ce goriva biti potroseno i koja je ukupna cena.
//Motor trosi 5 litara na 100 km
//Automobil trosi 9 litara na 100 km
//Kamion trosi 15 litara na 100 km
//Tipovi goriva su:
//Benzin kosta 195 dinara po litru
//Dizel kosta 220 dinara po litru
//Zadatak raditi kroz switch i pokriti samo happy flow uz default


import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double potrosnjaMotorNa100km = 5;
        double potrosnjaMotoraPoKilometru = potrosnjaMotorNa100km / 100;

        double potrosnjaAutomobilaNa100km = 9;
        double potrosnjaAutomobilaPoKm = potrosnjaAutomobilaNa100km / 100;

        double potrosnjaKamionaNa100km = 15;
        double potrosnjaKamionaPoKm = potrosnjaKamionaNa100km / 100;

        int cenaBenzinaPoLitru = 195;
        int cenaDizelaPoLitru = 220;

        System.out.println("Unesite predjenu distancu u kilometrima: ");
        int predjenaDistanca = sc.nextInt();

        System.out.println("Unesite tip vozila: ");
        String tipVozila = sc.next();

        System.out.println("Unesite tip goriva:");
        String tipGoriva = sc.next();

        //treba da izracunam  koliko je goriva ukupno potroseno za tip vozila
        double potrosenoGorivoZaPredjenuDistancu = 0;

        switch (tipVozila) {
            case "Motor":
                potrosenoGorivoZaPredjenuDistancu = potrosnjaMotoraPoKilometru * predjenaDistanca;
                break;
            case "Automobil":
                potrosenoGorivoZaPredjenuDistancu = potrosnjaAutomobilaPoKm * predjenaDistanca;
                break;
            case "Kamion":
                potrosenoGorivoZaPredjenuDistancu = potrosnjaKamionaPoKm * predjenaDistanca;
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila ");

        }

        //treba mi ukupna cena goriva

        double ukupnaCenaGoriva = 0;
        switch (tipGoriva) {
            case "Benzin":
                ukupnaCenaGoriva = cenaBenzinaPoLitru * potrosenoGorivoZaPredjenuDistancu;
                break;
            case "Dizel":
                ukupnaCenaGoriva = cenaDizelaPoLitru*potrosenoGorivoZaPredjenuDistancu;
                break;
            default:
            System.out.println("pogresan tip goriva");
        }

        System.out.println("");



    }
}
