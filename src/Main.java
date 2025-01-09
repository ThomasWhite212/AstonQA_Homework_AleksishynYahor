public class Main {
    public static void main(String[] args) {
        // Task_1
        System.out.println("\nTask_1");
        printThreeWords();

        // Task_2
        System.out.println("\nTask_2");
        checkSumSign();

        // Task_3
        System.out.println("\nTask_3");
        printColor();

        // Task_4
        System.out.println("\nTask_4");
        compareNumbers();

        // Task_5
        System.out.println("\nTask_5");
        System.out.println(isSumInRange(100, 5));

        // Task_6
        System.out.println("\nTask_6");
        checkNumber(6);

        // Task_7
        System.out.println("\nTask_7");
        System.out.println(isNegative(-5));

        // Task_8
        System.out.println("\nTask_8");
        printString("Hello", 5);

        // Task_9
        System.out.println("\nTask_9");
        System.out.println(isLeapYear(2001));

        // Task_10
        System.out.println("\nTask_10");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(binaryArray);
        printArray(binaryArray); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

        // Task_11
        System.out.println("\nTask_11");
        int[] longArray = fillArray();
        printArray(longArray); // [1, 2, 3, ..., 100]

        // Task_12
        System.out.println("\nTask_12");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArray(array);
        printArray(array);

        // Task_13
        System.out.println("\nTask_13");
        int[][] matrix = createDiagonalMatrix(5);
        printMatrix(matrix);

        // Task_14
        System.out.println("\nTask_14");
        int[] customArray = createArray(5, 7);
        printArray(customArray); // [7, 7, 7, 7, 7]
    }

    // Task_1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Task_2
    public static void checkSumSign() {
        int a = 0;
        int b = -5;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Task_3
    public static void printColor() {
        int value = -10;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Task_4
    public static void compareNumbers() {
        int a = 50;
        int b = 40;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Task_5
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // Task_6
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Task_7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // Task_8
    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // Task_9
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Task_10
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

    // Task_11
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Task_12
    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // Task_13
    public static int[][] createDiagonalMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
            matrix[i][n - i - 1] = 1;
        }
        return matrix;
    }

    // Вспомогательный метод для вывода матрицы
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Task_14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    // Вспомогательный метод для вывода массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}