public class Main {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 7;
        int b = -5;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 43;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 12;
        int b = 40;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void printIsPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isPositive(int number) {
        return number >= -6;
    }
    public static void printString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void replace0and1() {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void fillArrayFrom1To100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void multiplyIfLessThan6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void fillDiagonal() {
        int size = 5;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
            arr[i][size - i - 1] = 1;
        }
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(7, 5));
        printIsPositiveOrNegative(-10);
        System.out.println(isPositive(5));
        printString("Pipidastr", 3);
        System.out.println(isLeapYear(2024));
        replace0and1();
        fillArrayFrom1To100();
        multiplyIfLessThan6();
        fillDiagonal();
        int[] arr = createArray(5, 7);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}