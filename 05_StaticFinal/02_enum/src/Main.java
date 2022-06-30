public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(10,2, Operation.MULTIPLY);
        System.out.println(arithmeticCalculator.calculate(Operation.MULTIPLY));
    }

}
