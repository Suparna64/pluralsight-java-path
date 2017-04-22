package com.jcsanchez.myapp;

import com.jcsanchez.calcengine.Adder;
import com.jcsanchez.calcengine.CalculateBase;
import com.jcsanchez.calcengine.CalculateHelper;
import com.jcsanchez.calcengine.Divider;
import com.jcsanchez.calcengine.DynamicHelper;
import com.jcsanchez.calcengine.InvalidStatementException;
import com.jcsanchez.calcengine.MathEquation;
import com.jcsanchez.calcengine.MathProcessing;
import com.jcsanchez.calcengine.Multiplier;
import com.jcsanchez.calcengine.PowerOf;
import com.jcsanchez.calcengine.Subtracter;

public class Main {

    public static void main(String[] args) {
//    	useMathEquation();
//		useCalculatorBase();
//		useCalculateHelper();

        String[] statements = {
                "add 25.0 92",
                "power 5.0 2.0"
        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf()
        });

        for (String statement : statements) {
            String output = helper.process(statement);
            System.out.println(output);
        }

    }

    private static void useCalculateHelper() {
        String[] statements = {
                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println("  Original exception: " + e.getCause().getMessage());
            }
        }
    }

    private static void useCalculatorBase() {
        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for (CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }
    }

    private static void useMathEquation() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("Result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();
    }
}
