import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y;
    UnaryOperator<Integer> pow = x -> x * x;

    //    UnaryOperator<Integer> abs = (x, y) -> y > 0 ? (x / y) : 0;
// Operator '>' cannot be applied to '<lambda parameter>',
    UnaryOperator<Integer> abs = x -> {
        if (x > 0) {
            return x;
        } else {
            return x * -1;
        }
    };
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
