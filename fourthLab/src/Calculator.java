public class Calculator<T extends Number> {
    private T first;
    private T second;

    public Calculator(T first, T second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Аргумент нелегал");
        }
        this.first = first;
        this.second = second;
    }

    public double add() {
        return first.doubleValue() + second.doubleValue();
    }

    public double subtract() {
        return first.doubleValue() - second.doubleValue();
    }

    public double multiply() {
        return first.doubleValue() * second.doubleValue();
    }

    public double divide() {
        double secondDouble = second.doubleValue();
        if (secondDouble == 0.0) {
            throw new ArithmeticException("Нельзя делить на бублик");
        }
        return first.doubleValue() / secondDouble;
    }

    public double average() {
        return add() / 2.0;
    }

    public <N extends Number> double square(N value) {
        if (value == null) {
            throw new IllegalArgumentException("нельзя");
        }
        double v = value.doubleValue();
        if (v == 0) {
            throw new IllegalArgumentException("нельзя");
        }
        return v * v;
    }
}
