//5. Write a program to sum of digits of a number.
// until getting single digit

package com.company;

import java.math.BigInteger;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        int  sum=0;


        while((number > 0) || (sum > 9)) {
//            System.out.println("n1 = "+number);
//            System.out.println("sum1 = "+sum);
            if (number == 0) {
                number = sum;
//                System.out.println("n2 = "+number);
                sum = 0;

            }
            sum += number % 10;
//            System.out.println("sum2 = "+sum);
            number /= 10;
//            System.out.println("n3 = "+number);
        }
        System.out.println("sum of digits= "+sum);
    }
}
