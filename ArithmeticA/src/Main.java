import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2  числа и нажмите enter: ");
        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();
        Arithmetic enteredArithmetic = new Arithmetic(firstNumber, secondNumber);
        System.out.println("1. Сумма чисел = " + enteredArithmetic.sum() + "\n2. Произведение чисел = " + enteredArithmetic.multiply() + "\n3. Максимальное число = " + enteredArithmetic.maxNumber() + "\n4. Минимальное число = " + enteredArithmetic.minNumber());

    }
// pamparam
}

