public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        //задача 1
        byte a = 1;
        short b = 100;
        int c = 2345;
        long d = 1_000_000;
        float e = 1.15f;
        double f = 29.01d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    /*27.12
987 678 965 549
2,786
569
-159
27897
67*/
    public static void task2 () {
        System.out.println("Задача 2");
        //задача 2
        float num_1 = 27.12f;
        long num_2 = 987_678_965_549L;
        float num_3 = 2.786f;
        int num_4 = 569;
        short num_5 = -159;
        int num_6 = 27_897;
        short num_7 = 67;
        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(num_4);
        System.out.println(num_5);
        System.out.println(num_6);
        System.out.println(num_7);
    }
    public static void task3() {
        System.out.println("Задача 3");
        //задача 3
        short lyudPav = 23;
        short anSerg = 27;
        short ekAnd = 30;
        short paper = 480;
        int totalCount = lyudPav + anSerg + ekAnd;
        int paperForOne = paper /totalCount;
        System.out.println("На каждого ученика рассчитано " + paperForOne + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        //задача 4
        short capacity_2min = 16;
        int capacity_1min = capacity_2min / 2;
        int capacity_20min = capacity_1min * 20; //за 20 минут,
        int day = 24 * 60;
        int capacityForDay = capacity_1min * day; // в сутки,
        int capacity_3day = capacityForDay * 3; // за 3 дня,
        int capacityForMonth = capacityForDay * 30; // за 1 месяц
        System.out.println("За 20 минут машина произвела " + capacity_20min + " штук бутылок");
        System.out.println("За сутки машина произвела " + capacityForDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + capacity_3day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + capacityForMonth + " штук бутылок");
    }

}