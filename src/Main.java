public class Main {
    public static void main(String[] args) {
     // ЗАДАНИЕ 1
        System.out.println("ЗАДАНИЕ 1");
        byte houseFloors = 2;
        short tools = 150;
        int planking = 35_000;
        long nails = 10_000_000L;
        float plywood = 80.6f;
        double nailsWeight = 39.2050407;
        char d = 64;
        boolean contructionIsPossible = houseFloors < 3;
        System.out.println(d);
        System.out.println(contructionIsPossible);

    // ЗАДАНИЕ 2
        System.out.println("ЗАДАНИЕ 2");
        float battler1 = 78.2f;
        float battler2 = 82.7f;
        var totalWeight = battler1 + battler2;
        var weightDifferenceBattler = battler2 - battler1;
        System.out.println("Общий вес 2х бойцов " + totalWeight + "кг ");
        System.out.println("Разница в весе боксеров " + weightDifferenceBattler + "кг ");

     // ЗАДАНИЕ 2 - копирование видео-подсказки

         System.out.println("ЗАДАНИЕ 2 - копирование видео подсказки");
         double boxer1 = 78.2;
         double boxer2 = 82.7;
         double weightOfAllBoxers = boxer1 + boxer2;
         System.out.println("Общий вес боксеров " + weightOfAllBoxers);
         double weightDifference = boxer2 - boxer1;
         System.out.println("Разница в весе боксеров " + weightDifference);



    // ЗАДАНИЕ 3
        System.out.println("ЗАДАНИЕ 3");
        byte bananaUnit = 5;
        byte bananaUnitWeightG = 80;
        int milkMl = 200;
        int milk100GWeightG = 105;
        int icecreamPlombirUnit = 2;
        byte icecreamUnitWeightG = 100;
        byte eggUnit = 4;
        int eggUnitWeightG = 70;

        //Вес бананов
        int bananaWeightG = (bananaUnit * bananaUnitWeightG);
        //System.out.println("Вес бананов " + bananaWeightG + "г ");

        //Вес молока
        float milkOneMlWeightG = (float) milk100GWeightG / 100;
        //System.out.println("Вес молока 1 мл " + milkOneMlWeightG + "г ");
        float milkWeightG = (float) (milkOneMlWeightG * milkMl);
        //System.out.println("Вес молока 200 мл " + milkWeightG + "г ");

        //Вес мороженого
        float icecreamPlombirWeightG = (float) (icecreamPlombirUnit * icecreamUnitWeightG);
        //System.out.println("Вес мороженого общий " + icecreamPlombirWeightG + "г ");

        //Вес яиц
         float eggWeightG = (float) (eggUnit * eggUnitWeightG);
         //System.out.println("Вес яиц общий " + eggWeightG + "г ");

        //Итого вес завтрака
        float breakfastWeightG =  bananaWeightG + milkWeightG + icecreamPlombirWeightG + eggWeightG;
        System.out.println("Вес спорт-завтрака  " + breakfastWeightG + "г ");

    // ЗАДАНИЕ 4
         System.out.println("ЗАДАНИЕ 4");
         int lossTargetKg = 7;
         int grPerKg = 1000;
         int lossPossibility1 = 250;
         int lossPossibility2 = 500;
         byte loss1 = (byte) (lossTargetKg * grPerKg / lossPossibility1);
         System.out.println("При потере " + lossPossibility1 + "г веса в день понадобится " + loss1 + " дней ");
         byte loss2 = (byte) (lossTargetKg * grPerKg / lossPossibility2);
         System.out.println("При потере " + lossPossibility2 + "г веса в день понадобится " + loss2 + " дней ");

    // ЗАДАНИЕ 5
        System.out.println("ЗАДАНИЕ 5");


    }
}