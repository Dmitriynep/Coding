public class Main {
    public static void main(String[] args) {
        Employee dmitriy = new Employee("Дмитрий Алексеев", 6567);
        Employee vanek = new Employee("Иван Петрович", "sobaka@mail.ru");
        Employee vera = new Employee("Вера Алексеевна","durko@gmail.com", 2131);

        dmitriy.printInfo();
        vanek.printInfo();
        vera.printInfo();

    }
//        User dmitry = new User("Дмитрий", 11);
//        User balda = new User("Прокофий", 22);
//        User vovchik = new User("Владимир", 64);
//
//
//        printUserInfo(dmitry);
//        printUserInfo(balda);
//        printUserInfo(vovchik);
//
//        System.out.println(1555 % 100);
//
//    }
//
//    private static void printUserInfo(User user) {
//        int age = user.showAge();
//        String name = user.showName();
//        String label = "";
//        boolean isExclusion = (age % 100 >= 11) &&
//                (age % 100 <= 14);
//        int ageLastDigit = age % 10;
//        if (ageLastDigit == 1) {
//            label = "год";
//        } else if(ageLastDigit == 0 ||
//                ageLastDigit >= 5 && ageLastDigit <= 9) {
//            label = "лет";
//        } else if(ageLastDigit >= 2 && ageLastDigit <= 4) {
//            label = "года";
//        }
//        if (isExclusion) {
//            label = "лет";
//        }
//
//        System.out.println("Пользователь: " + user.showName() +
//                ", " + age + " " + label);
//        }
    }
