import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Пожалуйста введите число для которого вы хотите посчитать факториал");

        int value = new Scanner(System.in).nextInt();
        int result = 1;


        // Код высчитывающий факториал числа без подробностей в окне вывода
//        for (int i = 1; i <= value; i++) {
//            result = result * i;
//
//        }
//        System.out.println(value + "! = " + result);

        // Код высчитывающий результат с подробным выводом всех элементов




            System.out.print(value + "! = ");

            for (int i = 1; i <= value; i++) {

                result = result * i;

                if (i != value) {
                    System.out.print(i + " * ");
                } else {
                    System.out.print(i + " = ");
                }


            }
            System.out.print(result);


    }
}