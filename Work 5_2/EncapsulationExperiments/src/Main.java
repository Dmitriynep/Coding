public class Main {
    public static void main(String[] args) {

        Ocean arctic = new Ocean("Арктический");

        arctic.setSquare(14.75);
        arctic.setFreezing(true);
        String freezing = (arctic.isFreezing())?"Во льдах":"Не замерзает";

        System.out.println(arctic.getName() + " " + arctic.getSquare() + " млн.км " + freezing );



//        Country Russia = new Country("Russia");
//        Russia.setCapital("Moscow");
//        System.out.println(Russia.getCapital());
//        System.out.println(Russia.getName());
//
//        Russia.setPopulation(150000000);
//        System.out.println(Russia.getPopulation()  + " Million of people live there");


    }




//    public static void main(String[] args) {
//        ChildBankAccount account =
//                new ChildBankAccount(10000);
//        account.depositMoney(1000);
//        account.depositMoney(2000);
//        account.depositMoney(10000);
//        account.depositMoney(-1000);
//        System.out.println("Balance: " + account.getBalance());
//
//        account.debitMoney(500);
//        account.debitMoney(422.75);
//        account.debitMoney(50000);
//        account.debitMoney(-50);
//        System.out.println("Balance: " + account.getBalance());
//    }
}