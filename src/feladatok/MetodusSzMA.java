package feladatok;

public class MetodusSzMA {

    public static void main(String[] args) {
        nehanySzamGyokenekMegjelenitese();
    }

    private static void nehanySzamGyokenekMegjelenitese() {
//        haromSzamGyokeKonzolon();  
        otSzamGyokeKonzolon();
    }

//    private static void haromSzamGyokeKonzolon() {
//        int osszeg = osszegzes(2, osszegzes(1, 3, 5), 5);
//        double gyokszam = GyokSzamitas(osszeg);
//        System.out.println("A(z) " + osszeg + " szám négyzetgyöke: " + gyokszam);
//    }
    
    private static void otSzamGyokeKonzolon() {
        int[] szamok = {3, 5, 12, 3, 2};
        int osszeg = osszegzes(szamok);
        double gyokszam = GyokSzamitas(osszeg);
        System.out.println("A(z) " + osszeg + " szám négyzetgyöke: " + gyokszam);
    }

    private static double GyokSzamitas(int ossz) {
        return Math.sqrt(ossz);
    }
    
    private static int osszegzes(int[] tomb) {
        int ossz = 0;
        for (int i = 0; i < tomb.length; i++) {
            ossz += tomb[i];
        }
        return ossz;
    }
    
//    private static int osszegzes(int a, int b, int c) {
//        return osszegzes(new int[] = a + b + c);
//    }
}
