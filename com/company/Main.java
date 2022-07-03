package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        try {
            if (b == 0)
                throw new ArithmeticException("Exception: Деление на ноль.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        String s = calc.divide.apply(a, b);
        int d = calc.pow.apply(100);
        int e = calc.abs.apply(-75);
        boolean l = calc.isPositive.test(e);

        int f = calc.multiply.apply(d, e);

        calc.println.accept(c);
        calc.printlnS.accept(s);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
        calc.printlnB.accept(l);
    }
}
