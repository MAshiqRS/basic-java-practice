//5. Write a program to sum of digits of a number.
// until getting single digit

package com.company;


import java.util.*;

public class P5_SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Input Limit for Mathematical Approach is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 .\nInput Limit for String Approach is Unlimited");
        System.out.println("Mathematical Approach do the sum until the result became a single digit\nString Approach do the sum Just for the given input Once.");
        System.out.println("For Mathematical approach Press 1.\nFor String approach Press 2.");
        Scanner input = new Scanner(System.in);
        int  a= input.nextInt();
        if (a==1){
            System.out.println("Please Enter a Number:");
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
            System.out.println("Sum of Digits = "+sum);
        }
        else if( a==2){
            System.out.println("Please Enter a Number:");
            String s = input.next();
            long sum=0;
            for(int i=0; i<s.length(); i++){
//            System.out.println(i);
//            System.out.println(s.charAt(i));
                int digit = Character.getNumericValue(s.charAt(i));
//            System.out.println(d);
                sum = sum + digit;
//            System.out.println(sum);
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Wrong input !!\n Please press only between 1 & 2.");
        }

    }
}
