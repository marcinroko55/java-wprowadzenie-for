public class ZliczanieZnakow {
    public static void main(String[] args) {
        char[] sign = {'a', 'A', 'a', 'A', 'e', 'a'};
        int suma = 0;
        for (int i = 0; i < sign.length; i++) {
            if (sign[i] == 'a'|| sign[i] == 'A') {
                suma++;
            }

        }
        System.out.println(suma);


        }
    }

