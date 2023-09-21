import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int[] spending = generateRandomArray();
        System.out.println(Arrays.toString(spending));
        int sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum = sum + spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    private static void task2() {
        int[] spending = generateRandomArray();
        System.out.println(Arrays.toString(spending));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < spending.length; i++) {
            if (spending[i] < min) {
                min = spending[i];
            }
            if (spending[i] > max) {
                max = spending[i];
            }
        }
        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) {
            System.out.println("Массив пустой");
        } else {
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        }
    }

    private static void task3() {
        int[] spending = generateRandomArray();
        System.out.println(Arrays.toString(spending));
        int sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum = sum + spending[i];
        }
        double average = (double) sum / spending.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }
    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}