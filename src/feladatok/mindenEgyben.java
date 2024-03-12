package feladatok;

public class mindenEgyben {
    public static void main(String[] args) {
        konzolonMinden();
    }

    private static void konzolonMinden() {
        listaFeltoltes(7);
        konzolraIr("Egy soros kiírás vesszővel:\n");
        vesszovelKiiras();
        konzolraIr("Négyzetes kiírás:\n");
        negyzetesKiiras();
    }

    private static char[] listaFeltoltes(final int MERET) {
        char[] tomb = new char[MERET];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (char) (97 + i);
        }
        return tomb;
    }
    
    private static void vesszovelKiiras() {
        char[] lista = listaFeltoltes(7);
        int i;
        for (i = 0; i < lista.length - 1; i++) {
            konzolraIr(lista[i] + ", ");
        }
        konzolraIr(lista[i] + "\n");
    }
    
    private static void negyzetesKiiras() {
        char[] lista = listaFeltoltes(7);
        for (int i = 0; i < lista.length; i++) {
            if (i != 0 && i % 3 == 0) {
                konzolraIr("\n");
            }
            konzolraIr(lista[i] + " ");
        }
        konzolraIr("\n");
    }
    
    private static void konzolraIr(String uzenet) {
        System.out.print(uzenet);
    }
}
