public class Main {
    public static void main(String[] args) {
        System.out.println("5 и 2");
        Calculator<Integer> intCalculate = new Calculator<>(5, 2);
        System.out.println(intCalculate.add());
        System.out.println(intCalculate.subtract());
        System.out.println(intCalculate.multiply());
        System.out.println(intCalculate.divide());
        System.out.println(intCalculate.average());

        System.out.println("7.5 и 2.5");
        Calculator<Double> doubleCalc = new Calculator<>(7.5, 2.5);
        System.out.println(doubleCalc.add());
        System.out.println(doubleCalc.subtract());
        System.out.println(doubleCalc.multiply());
        System.out.println(doubleCalc.divide());
        System.out.println(doubleCalc.average());

        System.out.println("-3 и 4");
        Calculator<Integer> negativeCalculate = new Calculator<>(-3, 4);
        System.out.println(negativeCalculate.add());
        System.out.println(negativeCalculate.subtract());
        System.out.println(negativeCalculate.multiply());
        System.out.println(negativeCalculate.divide());
        System.out.println(negativeCalculate.average());

        System.out.println("10 и 0");
        try {
            Calculator<Integer> zeroDiv = new Calculator<>(10, 0);
            System.out.println( zeroDiv.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("null и 2");
        try {
            Calculator<Integer> nullCalc = new Calculator<Integer>(null, 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Доп задание (5, 2.5 и -4)");
        System.out.println(Calculator.square(5));
        System.out.println(Calculator.square(2.5));
        System.out.println(Calculator.square(-4));
    }
}
