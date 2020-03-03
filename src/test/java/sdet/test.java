package sdet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class test {
    public static void main(String[] args) {
        MathOperation add = Integer::sum;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(calculate(add));
        System.out.println(calculate(subtract));
        System.out.println(calculate(multiply));
        System.out.println(calculate(divide));

        int onScreenNumber = 0;

        onScreenNumber = calculate2(5, add, 2);
        onScreenNumber = calculate2(onScreenNumber, subtract, 3);

        System.out.println(onScreenNumber);


        //System.out.println(5 + 2 - 3 * 7 + 2 / 3);

        List<String> list = new ArrayList<>();
        list.sort((o1, o2) ->
        {
            return o1.length() > o2.length() ? 1 : -1;

        });


    }

    private static int calculate(MathOperation mathOperation) {
        int a = 10;
        int b = 10;
        return mathOperation.operate(a, b);
    }

    private static int calculate2(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }


}
