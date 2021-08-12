public class WyliczanieSredniej {
    public static void main(String[] args) {

        int[] oceny = {3, 4, 4, 4, 4, 3, 3, 5};
        double suma = 0;
        for (int i = 0; i < oceny.length; i++) {
            suma = suma + oceny[i];
        }
        System.out.println(suma / oceny.length);
    }
}
