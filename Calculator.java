import org.w3c.dom.ls.LSOutput;

public class Calculator {

    public int additionMethod(int num1, int num2) {
        int sumResult = num1 + num2;
        return sumResult;

    }

    public int subtractMethod(int num1, int num2) {
        int subtractResult = num1 - num2;
        return subtractResult;

    }

    public int multiplyMethod(int num1, int num2) {
        int multiplyResult = num1 * num2;
        return multiplyResult;

    }

    public int divideMethod(int num1, int num2) {
        int divideResult = num1 / num2;
        return divideResult;

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = calculator.additionMethod(3, 4);
        System.out.println(x);

        int y = calculator.subtractMethod(12, 7);
        System.out.println(y);
    }
}

