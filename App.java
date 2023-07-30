package org.example;

import java.util.Optional;

public class App {
    //    public int Calculator(int a, int b)
//    {
//        return a+b;
//    }
//    public static void main( String[] args ) {
//        App app = new App();
//        app.Calculator(5,2);
//
//    }
//    public static void main(String args[]) {
//        int a = 10, b = 0, c;
//        c = a / b;
//        System.out.println("c");
//    }

    public static void main(String args[]) {
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Cannot divde by zero");
        }

    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }


    public static Optional<Integer>
    optionalDivide(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        } else {
            int value = a / b;
            return Optional.of(value);
        }
    }

}
