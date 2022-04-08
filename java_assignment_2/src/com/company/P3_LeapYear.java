/*3. Find out the leap years from the given array and print them
[2000, 2002, 2004, 2006, 2008, 2010, 2012, 2014, 2016, 2018, 2020, 2022, 2024]*/

package com.company;

public class P3_LeapYear {
    static void LeapYear() {
        int[] year = new int[]{2000, 2002, 2004, 2006, 2008, 2010, 2012, 2014, 2016, 2018, 2020, 2022, 2024};
        int sum = 0;
        int count = 0;
        System.out.println("Leap year from the given Array are: ");

        for(int i = 0; i < year.length; ++i) {
            if (year[i] % 400 == 0 || year[i] % 4 == 0) {
                System.out.println(year[i]);
            }
        }
    }

    public static void main(String[] args) {
        LeapYear();

    }
}
