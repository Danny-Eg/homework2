public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1");

        byte a = 1;
        System.out.println("«Значение переменной a с типом byte равно» " + a);
        short b = 150;
        System.out.println("«Значение переменной b с типом short равно» " + b);
        int c = 30000;
        System.out.println("«Значение переменной c с типом int равно» " + c);
        long d = 7000000L;
        System.out.println("«Значение переменной d с типом long равно» " + d);
        float e = 7.75517f;
        System.out.println("«Значение переменной e с типом float равно » " + e);
        double f = 320.55556265215;
        System.out.println("«Значение переменной f с типом double равно» " + f);

        System.out.println("Задание2");

        float a1 = 27.12f;
        long b1 = 987678965549L;
        double c1 = 2.786;
        int d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;

        System.out.println("Задание3");

        byte LyudmilaStudents = 23;
        byte AnnaStudents = 27;
        byte EkaterinaStudents = 30;
        short allBuyPaper = 480;
        int allStudent = LyudmilaStudents + AnnaStudents + EkaterinaStudents;
        int paperOneStudent = allBuyPaper / allStudent;
        System.out.println("«На каждого ученика рассчитано " + paperOneStudent + " листов бумаги»");

        System.out.println("Задание4");

        byte workTwoTimeMinutes = 16;
        int machineWorkOneTimeMinutes = workTwoTimeMinutes / 2;
        int machineWorkTwentyMinutes = machineWorkOneTimeMinutes * 20;
        int minutesOneDay = 60 * 24;
        int machineWorkOneDay = minutesOneDay * machineWorkOneTimeMinutes;
        int machineWorkThreeDays = machineWorkOneDay * 3;
        int machineWorkOneMonth = machineWorkOneDay * 30;
        System.out.println("«За 20 минут машина произвела " + machineWorkTwentyMinutes + " штук бутылок»");
        System.out.println("«За день машина произвела " + machineWorkOneDay + " штук бутылок»");
        System.out.println("«За 3 дня машина произвела " + machineWorkThreeDays + " штук бутылок»");
        System.out.println("«За 1 месяц(30 дней) машина произвела " + machineWorkOneMonth + " штук бутылок»");


        System.out.println("Задание5");

        short allPaintCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int oneClassPaint = whitePaint + brownPaint;
        int allClass = allPaintCans / oneClassPaint;
        int whiteCan = allClass * whitePaint;
        int brownCan = allClass * brownPaint;
        System.out.println("«В школе, где " + allClass + " классов, нужно " + whiteCan + " банок белой краски и " + brownCan + " банок коричневой краски»");

        System.out.println("Задание6");
        int bananaGrams = 5 * 80;
        int milkGrams = 200 / 100 * 105;
        int iceCreamGrans = 2 * 100;
        int eggsGrams = 4 * 70;
        int allGrams = bananaGrams + milkGrams + iceCreamGrans + eggsGrams;
        double weightInKg = (double) allGrams / 1000;
        System.out.println("Вес в граммах " + allGrams);
        System.out.println("Вес в Кг " + weightInKg);

        System.out.println("Задание7");
        int targetWeightInKg = 7;
        int targetWeightInGrams = targetWeightInKg * 1000;
        double perDay250Grams = (double) targetWeightInGrams / 250;
        double perDay500Grams = (double) targetWeightInGrams / 500;
        double averageDays = (perDay500Grams + perDay250Grams) / 2;

        System.out.println("Дней с сбросои веса в 250 грамм = " + perDay250Grams);
        System.out.println("Дней с сбросои веса в 500 грамм =  " + perDay500Grams);
        System.out.println("Дней в среднем для достижениии цели = " + averageDays);

        System.out.println("Задание8");
        double percentSalary = 1.1;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int MashaSalary = 67760;

        int sumOneYearDenisSalary = denisSalary * 12;
        int sumOneYearKristinaSalary = kristinaSalary * 12;
        int sumOneYearMashaSalary = MashaSalary * 12;

        double newDenisSalary = denisSalary * percentSalary;
        double newKristinaSalary = kristinaSalary * percentSalary;
        double newMashaSalary = MashaSalary * percentSalary;

        double newSumOneYearDenisSalary = newDenisSalary * 12;
        double newSumOneYearKristinaSalary = newKristinaSalary * 12;
        double newSumOneYearMashaSalary = newMashaSalary * 12;

        double differenceSalaryDenis = newSumOneYearDenisSalary - sumOneYearDenisSalary;
        double differenceSalaryKristina = newSumOneYearKristinaSalary - sumOneYearKristinaSalary;
        double differenceSalaryMasha = newSumOneYearMashaSalary - sumOneYearMashaSalary;

        System.out.println("«Денис теперь получает " + newSumOneYearDenisSalary + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей»");
        System.out.println("«Кристина теперь получает " + newSumOneYearKristinaSalary + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей»");
        System.out.println("«Маша теперь получает " + newSumOneYearMashaSalary + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей»");


    }
}