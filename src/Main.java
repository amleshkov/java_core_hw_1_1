public class Main {

    static Calculator calc = Calculator.instance.get();

    static int a = calc.plus.apply(1, 2);

    // int b = calc.minus.apply(1,1); = 0 -> исключение деления на 0 для с
    static int b = calc.minus.apply(2, 1);
    static int c = calc.divide.apply(a, b);
    static int d = calc.abs.apply(c);

    public static void main(String[] args) {
        calc.println.accept(d);
    }
}