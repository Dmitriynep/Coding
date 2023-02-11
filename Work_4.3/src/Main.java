//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Плизир, введите число и покажу вам его квадрат, если нажмёте Enter");
//        double value = new Scanner(System.in).nextDouble();
//        square(value);
//
//    }
//    public static void square (double value) {
//        System.out.println(value * value);
        calculateTriangleSquare(3,4,5);

    }
    public static void calculateTriangleSquare(double a, double b, double c) {
        double p = (a+b+c) / 2;
        double square = Math.sqrt( p * (p-a)*(p-b)*(p-c));
        System.out.println(square);
    }
}