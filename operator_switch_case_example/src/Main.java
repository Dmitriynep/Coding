import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {
            System.out.println(" Введите новое сообщение:");
            String input = new Scanner(System.in).nextLine();
//            if (input.equals("Привет!")) {
//                System.out.println("Здорова !");
//            } else if (input.equals("Как дела?")) {
//                System.out.println(" Отлично ! Как у тебя ?");
//            } else {
//                System.out.println(" Я тупая - не пойму тебя... (((");
//            }
//
//        }


            // Старый вариант использования switch case:
//            switch (input) {
//                case "Привет":
//                    System.out.println("Здорова !");
//                    break;
//                case "Как дела?":
//                    System.out.println("Опупительно");
//                    break;
//                default:
//                    System.out.println(" Моя твоя не понимая...");

            // Новый вариант с 14ой версии Java того же кода switch case:


            switch (input) {
                case "Привет" -> System.out.println("Здорова !");
                case "Как дела?" -> {
                    System.out.println("Опупительно");
                    System.out.println(" Как у тебя ?");
                }
                default -> System.out.println(" Моя твоя не понимая...");

            }
        }
    }
}