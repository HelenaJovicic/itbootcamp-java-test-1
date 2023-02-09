package TestPrvi;

//3. Kreirati dva niza brojeva
//Proveriti da li je suma parnih brojeva veca od sume neparnih brojeva u odnosu na drugi niz


public class Test3 {
    public static void main(String[] args) {

        int niz1[] = {1, 2, 3, 4};// treba mi suma parnih, ona je 6
        int niz2[] = {1, 2, 3, 4};//treba mi suma neparnih, ona je 4

        //suma parnih br za prvi niz
        int sumaParnihBrojevaPrvogNiza = 0;
        //treba mi suma neparnih br, to je drugi niz
        int sumaNeparnihBrojevaDrugogNiza = 0;

        //treba da izracunam sumu parnih za prvi niz
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] % 2 == 0) {
                //broj je paran, treba da ga dodam u sumu parnih
                sumaParnihBrojevaPrvogNiza = sumaParnihBrojevaPrvogNiza + niz1[i];

            }
        }
        //treba da izracunam sumu neparnih za drugi niz
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i] % 2 != 0) {
                //broj mi je neparan, dodajem ga u sumu neparnih
                sumaNeparnihBrojevaDrugogNiza = sumaNeparnihBrojevaDrugogNiza + niz2[i];

            }
        }
        if (sumaParnihBrojevaPrvogNiza > sumaNeparnihBrojevaDrugogNiza) {
            System.out.println("Suma parnih brojeva prvog niza " + sumaParnihBrojevaPrvogNiza + " veca je od sume neparnih brojeva drugo niza " + sumaNeparnihBrojevaDrugogNiza);
        } else {
            System.out.println("Suma parnih brojeva prvog niza " + sumaParnihBrojevaPrvogNiza + " nije veca od sume neparnih drugog " + sumaNeparnihBrojevaDrugogNiza);
        }
        //ne trazi se ali sam za svaki slucaj stavila zbog provere


    }
}
