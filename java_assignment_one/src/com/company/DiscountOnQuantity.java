//2.Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?

package com.company;

import java.util.*;

public class DiscountOnQuantity {
    public static void main(String[] args) {
        int shirt=1200;
        int sharee=3500;
        int count=0;

        Scanner quantity = new Scanner(System.in);
        System.out.println("How many Shirt Want to Purchase: ");
        int srt = quantity.nextInt();
        System.out.println("How many Sharee Want to Purchase: ");
        int sre = quantity.nextInt();
        int div = srt/2;
        for(int i=1 ; i<=div ; i++){
//            System.out.println(srt);
//            System.out.println(sre);
            if(i<=sre){
                count+=400;
//                System.out.println(count);
            }
        }
        System.out.println("Customer Got "+ count + " TK discount");
        System.out.println("After Discount , Total Cost is: "+ ((shirt*srt)+(sharee*sre)-count));

    }

}
