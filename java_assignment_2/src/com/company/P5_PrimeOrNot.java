/*5. Write a function to check if a number is prime or not*/
package com.company;

import java.util.Scanner;

public class P5_PrimeOrNot {
    static void PrimeOrNot() {
        Scanner prime = new Scanner(System.in);
        long a = prime.nextLong();
        int flag = 0;

        for(int i = 2; (long)i < a / 2; ++i) {
            if (a % (long)i == 0) {
                System.out.println(a + " is not a Prime Number.");
                flag = 1 ;
                break;
            }

        }

        if (flag == 0) {
            System.out.println(a + " is a Prime Number.");
        }
    }

    public static void main(String[] args) {
        PrimeOrNot();

    }
}
