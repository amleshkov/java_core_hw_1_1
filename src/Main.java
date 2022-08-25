public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = 0;

        try {
            c = calc.divide.apply(a, b);
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на 0");
            System.exit(1);
        }

        calc.println.accept(c);
    }
}