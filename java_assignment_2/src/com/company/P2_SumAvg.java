/*2. Find out the sum and average of given array only which are divisible by 5 and 2
[10, 3, 8, 7, 15, 6, 9, 16, 25, 18]*/

package com.company;

public class P2_SumAvg {
    static void SumAverage() {
        int[] number = new int[]{10, 3, 8, 7, 15, 6, 9, 16, 25, 18};
        int sum = 0;
        int count = 0;

        for(int i = 0; i < number.length; ++i) {
            if (number[i] % 5 == 0 && number[i] % 2 == 0) {
                sum += number[i];
                ++count;
            }
        }

        int avg = sum / count;
        System.out.println("Sum of the number which are divisible by both 5 & 2: " + sum + "\nAverage of them are: " + avg);
    }

    public static void main(String[] args) {
        SumAverage();
    }
}
