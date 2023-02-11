
public class Arithmetic {

    static int firstNumber = 0;
    static int secondNumber = 0;

    public Arithmetic(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int sum() {
        return (firstNumber + secondNumber);
    }

    public int multiply() {
        return (firstNumber * secondNumber);
    }

    public int maxNumber() {
        return ((firstNumber > secondNumber) ? firstNumber : secondNumber);
    }

    public int minNumber() {
        return ((firstNumber < secondNumber) ? firstNumber : secondNumber);
    }
}
