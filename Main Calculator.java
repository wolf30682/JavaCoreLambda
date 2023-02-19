package lambda_expressions;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int x = -2;
        int y = 3;

        int a = calc.plus.apply(x,y);
        calc.println.accept(a);

        int b = calc.minus.apply(x,y);
        calc.println.accept(b);

        int c = calc.devide.apply(x, y);
        calc.println.accept(c);

    }
}
