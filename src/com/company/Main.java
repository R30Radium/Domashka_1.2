package com.company;

public class Main {
    //задание 1
    public static void main(String[] args) {
        byte a = -30;
        short b = 32766;
        int c = 1234567890;
        long d = 9223372036854775806L;
        float e = 3.3f;
        double f = 3.1_415_926_535_697_932_384;
        char bar = 82;
        boolean r = 30 > 0;

        //задание 2
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        System.out.println("Общий вес = " + (firstFighterWeight + secondFighterWeight) + " кг");
        System.out.println("Разница в весе = "  + (secondFighterWeight - firstFighterWeight) + " кг");

        //задание 3
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;

        banana = banana * 5;
        milk = milk * 2;
        iceCream = iceCream * 2;
        egg = egg * 4;

        var gWeight = banana + milk + iceCream + egg;
        float kgWeight = gWeight / 1000f;
        System.out.println(kgWeight + " кг");

        //задание 4

        var moreWeightLoss = 500;
        var lessWeightLoss = 250;
        int weightToLose = 7000;
        int fastWeightLose = weightToLose / moreWeightLoss;
        int slowWeightLose = weightToLose / lessWeightLoss;
        System.out.println(weightToLose / lessWeightLoss + " дней");
        System.out.println(weightToLose / moreWeightLoss + " дней");
        System.out.println((fastWeightLose + slowWeightLose) / 2 + " день");

        //задание 5

        var salaryMasha = 67_760;
        var salaryDenis = 83_690;
        var salaryChristina = 76_230;

        var salaryMashaUp = salaryMasha / 100f * 110f;
        var salaryDenisUp = salaryDenis / 100f * 110f;
        var salaryChristinaUp = salaryChristina/ 100f * 110f;

        var salaryMashaYear = salaryMasha * 12;
        var salaryDenisYear = salaryDenis * 12;
        var salaryChristinaYear = salaryChristina * 12;

        var salaryMashaYearUp = salaryMashaUp * 12;
        var salaryDenisYearUp = salaryDenisUp * 12;
        var salaryChristinaYearUp = salaryChristinaUp * 12;

        var salaryMashaDifference = salaryMashaYearUp - salaryMashaYear;
        var salaryDenisDifference = salaryDenisYearUp - salaryDenisYear;
        var salaryChristinaDifference = salaryChristinaYearUp - salaryChristinaYear;

        System.out.println("Маша теперь получает " + salaryMashaYearUp + " рубля");
        System.out.println("Машин годовой доход вырос на " + salaryMashaDifference + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisYearUp + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + salaryDenisDifference + " рублей");
        System.out.println("Кристина теперь получает " + salaryDenisYearUp + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + salaryChristinaDifference + " рублей");
    }
}
