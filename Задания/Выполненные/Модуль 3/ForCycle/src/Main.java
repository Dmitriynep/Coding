import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число для которого хотите найти все пары положительных множетелей");

        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i++) {
            for (int y = 1; y <= value; y++) {
                if (i * y == value) {
                    System.out.println(i + "*" + y);
                }
            }

        }


    }
}