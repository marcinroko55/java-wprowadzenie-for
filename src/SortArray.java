public class SortArray {
    public static void main(String[] args) {

        int[] numbers = {87, -5, -89, 100, 133, 123, 0, 32};
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                }
            }
        }
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + ",");
        }


    }
}
