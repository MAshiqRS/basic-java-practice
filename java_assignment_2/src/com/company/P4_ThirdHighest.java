/*4. Write a program to find out the 3rd highest value from given array
[42, 30, 56, 63, 74, 86, 48]*/

package com.company;

import java.util.Arrays;

public class P4_ThirdHighest {
     static void ThirdHighestValue() {
         int[] arr = new int[]{42, 30, 56, 74, 86, 48};
         Arrays.sort(arr);
         int thirdHighest = 0;

         for(int i = 0; i < arr.length - 2; ++i) {
             thirdHighest = arr[i];
         }

         System.out.println(thirdHighest);
    }

    public static void main(String[] args) {
         ThirdHighestValue();
    }
}
