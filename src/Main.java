public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
    public static void task5() {
        System.out.println("Задача 5");
        //задача 5
        int totalJarCount = 120;
        int whiteColor = 2;
        int brownColor = 4;
        int classCount = totalJarCount / (whiteColor + brownColor);
        int whiteColoCount = classCount * whiteColor;
        int brownColorCount = classCount * brownColor;
        System.out.println("В школе, где " + classCount +
                " классов, нужно " + whiteColoCount + " банок белой краски и "+
                brownColorCount + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        //задача 6
        int bananasWeight = 80;
        int bananasCount = 5;
        int bananasTotalWeight = bananasWeight * bananasCount;
        int milkWeight = 105;
        int milkCount = 200;
        int milkTotalWeight = milkWeight * (milkCount / 100);
        int iceCreamWeight = 100;
        int iceCreamCount = 2;
        int iceCreamTotalWeight = iceCreamWeight * iceCreamCount;
        int eggsWeight = 70;
        int eggsCount = 4;
        int eggsTotalWeight = eggsWeight * eggsCount;
        int breakfastTotalWeight = bananasTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggsTotalWeight;
        System.out.print("Общий вес спортзавтрака " + breakfastTotalWeight + " г");
        System.out.println(" ли " + breakfastTotalWeight / 1000f + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        //задача 7
        int sportsmenWeight = 7;
        int lossWeightForDayMin = 250;
        int lossWeightForDayMax = 500;
        int daysForLossWeightMax = sportsmenWeight * 1000 / lossWeightForDayMin;
        int daysForLossWeightMin = sportsmenWeight * 1000 / lossWeightForDayMax;
        System.out.println("Если спортсмен будет худеть на " + lossWeightForDayMin +
                " г в день, то на " + sportsmenWeight + " кг он похудеет за " + daysForLossWeightMax + " дней");
        System.out.println("Если спортсмен будет худеть на " + lossWeightForDayMax +
                " г в день, то на " + sportsmenWeight + " кг он похудеет за " + daysForLossWeightMin + " дней");
        int daysForLossWeightAvg = (daysForLossWeightMax + daysForLossWeightMin) / 2;
        System.out.println("В среднем спортсмен похудеет за " + daysForLossWeightAvg + " день");
    }

}