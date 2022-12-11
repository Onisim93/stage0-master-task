package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        while (number != 0) {
            int remainderOfDividing = number % 10;
            number /= 10;
            sum += remainderOfDividing;
        }

        System.out.println(sum);
    }

}
