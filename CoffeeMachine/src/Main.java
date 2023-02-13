public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 1000;
        int skimmedMilkAmount = 1;


        boolean isBlocked = true;
        int capuccinoMilkRequired = 60;
        int capuccinoCoffeeRequired = 15;


        boolean milkIsEnough = skimmedMilkAmount >= capuccinoMilkRequired ||
                milkAmount >= capuccinoMilkRequired;

        boolean coffeIsEnough = coffeeAmount >= capuccinoCoffeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println(" Машина заблокирована !!!");
            hasErrors = true;
        }
        if (!coffeIsEnough) {
            System.out.println(" Кофе нету !");
            hasErrors = true;
        }
        if (!milkIsEnough) {
            System.out.println(" Молоко в машину вложь !!!");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println(" Всё тип-топ ! =)");
        }

    }
}

