//4. Write a program to create a digital Tasbih. Each time user press enter button, It will count the value. If user press 0, the value will be reset.

package com.company;

import java.util.Scanner;

public class DigitalTasbih {
    public static void main(String[] args) {
        System.out.println("If you need to count then Press 'Enter Key'");
        System.out.println("If you need reset counting then Press '0'");
        System.out.println("If you need to stop counting then Press any key");

        Scanner enter= new Scanner(System.in);
        int sum=0;

        while (true){
//            System.out.println(sum);
            String s= enter.nextLine();
                if(s.equals("")){
                    sum+=1;
                    System.out.print(sum);
                }
                else if(s.equals("0")){
                    sum=0;
//                    System.out.println(sum);
                }
                else{
                    break;

                }
        }
    }
}
