/*6. Write a program to check which values are duplicate and print them only
        [10, 5, 6, 6, 7, 8, 9, 9, 3, 1, 0, 0]*/




package com.company;

public class P6_DuplicateNumber {

    static  void DuplicateNumber() {
        int[] arr = new int[]{10, 5, 6, 6, 7, 8, 9, 9, 3, 1, 0, 0};

        for(int i = 0; i < arr.length; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        DuplicateNumber();

    }
}
