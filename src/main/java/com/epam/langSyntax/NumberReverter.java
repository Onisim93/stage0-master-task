package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int result = 0;

        while (number != 0) {
            int remainderOfDividing = number % 10;
            number /= 10;
            result = result * 10 + remainderOfDividing;
        }

        System.out.println(result);
    }

}
