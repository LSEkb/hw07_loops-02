public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int month = 0;
        int deposit = 0;
        int monthlyPayment = 15000;
        int moneyGoal = 2_459_000;

        while (deposit < moneyGoal) {
            deposit = deposit + monthlyPayment;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений " + deposit + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.printf(i + " ");
            i++;
        }
        System.out.println(" ");
        for (i = 10; i >= 1; i--) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");

        double population = 12_000_000;
        double increasePercent = 17. / 1000;
        double decreasePercent = 8. / 1000;

        for (int year = 0; year < 10; year++) {
            double increasePopulation = increasePercent * population;
            double decreasePopulation = decreasePercent * population;
            population = population + increasePopulation - decreasePopulation;
            System.out.println("Год " + (year + 1) + " численность населения составляет " + (int) population);
            //число человек не может быть дробным, поэтому для выведения приводим тип, чтобы на печати нормальнее выглядело.
            // В вычислениях остается точное число
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
    }

    public static void task5() {
        System.out.println("Задача 5");
    }

    public static void task6() {
        System.out.println("Задача 6");
    }

    public static void task7() {
        System.out.println("Задача 7");
    }

    public static void task8() {
        System.out.println("Задача 8");
    }
}