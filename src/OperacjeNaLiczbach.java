import java.util.Enumeration;

public class OperacjeNaLiczbach {
    public static void main(String[] args) {

        int[] table = {1, 2, 4, 3, 5, 8, 7, 9};
        int suma = 0;
        int iloczyn = 1;
        double mediana = 0;

        for (int i = 0; i < table.length; i++) {
            suma = suma + table[i];
            iloczyn = iloczyn * table[i];
        }
        for (int j = 0; j < table.length; j++) {
            for (int i = 0; i < table.length - 1; i++) {
                if (table[i] < table[i + 1]) {
                    int tmp = table[i + 1];
                    table[i + 1] = table[i];
                    table[i] = tmp;
                }
            }
        }
        if (table.length % 2 == 0) {
            double srodkowe = 0;
            srodkowe = table[table.length/2] + table[(table.length/2)-1];
            mediana = srodkowe/2;
        }else {
            mediana = table[table.length/2];
        }

        System.out.println("suma liczb wynosi: " + suma);
        System.out.println("iloczyn liczb wynosi: " + iloczyn);
        System.out.println("najmniejsza liczba wynosi: " + table[table.length -1]);
        System.out.println("największa liczba wynosi: " + table[0]);
        System.out.println("mediana wynosi: " + mediana);

    }
}
