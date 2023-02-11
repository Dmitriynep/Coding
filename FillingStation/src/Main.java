public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта стоимости топлива");
        int fuelType = 95;
        int amount = 20;

        double fuel92Price = 60.2;
        double fuel95Price = 67.33;
        String fuelPriceMessage;
        boolean hasDiscount = amount > 10;

        double discount = 0.1;

        String wrongFuelTypeMessage = "Указан неверный тип топлива";
        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95Price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelPrice = fuelPrice * (1 - discount);
        }
        if (amount < 1) {
            System.out.println(" Указано слишком малое количество топлива");
            amount = 0;
        }

        fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";
        System.out.println(fuelPriceMessage);

        double fullPrice = fuelPrice * amount;
        System.out.println("Полная стоимость бензина:" + fullPrice + " руб.");

    }

}