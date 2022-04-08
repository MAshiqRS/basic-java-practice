/*7. Find
the number of notes from input amount in given array
[1000,500,100,50,20,10,5, 2, 1]
For example, input any amount as 530
Output will be:
500 1
20 1
10 1


another example, input any amount 1693
Output:
1000 1
500 1
100 1
50 1
20 2
10 1
2 1
1 1
*/
package com.company;

import java.util.Scanner;

public class P7_FindingNotes {
    static void FindingNotes(int value) {
        int[] arr = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};

        for(int i = 0; i < arr.length; ++i) {
            if (value >= arr[i]) {
                int x = value / arr[i];
                System.out.println(arr[i] + "'s note " + x);
                value -= x * arr[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner amount = new Scanner(System.in);
        int value = amount.nextInt();
        FindingNotes(value);

    }
}
