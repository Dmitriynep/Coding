import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Плиз напишите 3 числа и пожамкайте интер между ними - я вам сумму их напишу");
//        double a = new Scanner(System.in).nextDouble();
//        double b = new Scanner(System.in).nextDouble();
//        double c = new Scanner(System.in).nextDouble();
//
//
//        double sum = calculateSum(a,b,c);
//
//        System.out.println(sum);
//    }
//    public static double calculateSum (double a, double b, double c) {
//        return a+b+c;

        System.out.println("Введите 2 числа");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println(biggestNumber(a,b));

    }
    public static int biggestNumber (int a, int b) {
        if (a>b) {
            return a;
        }
        if (b>a) {
            return b;
        }
        else System.out.println("Same numbers");
        return a;
    }
}