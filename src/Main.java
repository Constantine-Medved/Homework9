public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1.");
        int[ ] arrForSum = generateRandomArray();
        int sum = 0;
        for (int index : arrForSum) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task2() {
        System.out.println("Задача 2.");
        int[ ] arrForMinMax = generateRandomArray();
        int sumMonthExpenses = 0;
        for (int dailyExpenses : arrForMinMax) {
            sumMonthExpenses += dailyExpenses;
        }
        int minDailyExpenses = sumMonthExpenses;
        int maxDailyExpenses = 0;
        for (int dailyExpenses : arrForMinMax) {
            if (dailyExpenses > maxDailyExpenses) {
                maxDailyExpenses = dailyExpenses;
            }
        }
        for (int dailyExpenses : arrForMinMax) {
            if (minDailyExpenses > dailyExpenses) {
                minDailyExpenses = dailyExpenses;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDailyExpenses + " рублей. " + "Максимальная сумма трат за день составила " + maxDailyExpenses + " рублей.");
    }
    public static void task3() {
        System.out.println("Задача 3.");
        }
    public static void task4() {
        System.out.println("Задача 4.");
    }
}