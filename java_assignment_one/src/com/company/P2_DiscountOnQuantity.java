//2.Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?

package com.company;

import java.util.*;

public class P2_DiscountOnQuantity {
    public static void main(String[] args) {
        System.out.println("There are 2 Approach here.\n1.String Approach.(No need to give any User Input)\n2.Mathematical Approach. (User must give the Price & quantity of the products)\nFor String Approach press 1.\nFor Mathematical Approach press 2.");
        Scanner choice = new Scanner(System.in);
        int cho = choice.nextInt();
        if(cho==1){
            String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.";
            str = str.replaceAll("[^\\d]", " ");
//            System.out.println(str);
            str = str.trim();
//            System.out.println(str);
            str = str.replaceAll(" +", " ");
//            System.out.println(str);
            String[] arr = str.split(" ");
//            for (int i=0 ; i<arr.length; i++){
//                System.out.println(arr[i]);
//            }
            double shirt_price = Double.parseDouble(arr[0]);
            double sharee_price = Double.parseDouble(arr[1]);
            double shirt_quantity = Double.parseDouble(arr[2]);
            double shree_quantity = Double.parseDouble(arr[3]);
            double discount = Double.parseDouble(arr[4]);
//            System.out.println("Shirt Price "+ shirt_price);
//            System.out.println("Sharee Price "+ sharee_price);
//            System.out.println("Shirt Quantity "+ shirt_quantity);
//            System.out.println("Shirt Quantity "+ shree_quantity);
//            System.out.println("Discount value "+ discount);
            int counts = 0;
            int div = (int)shirt_quantity/2;
            System.out.println(div);
            for (int i=1; i<=div; i++){
                if(i<=shree_quantity){
                    counts+=discount;

                }
            }
            System.out.println("Customer Got "+ counts + " TK discount");
            System.out.println("After Discount , Total Cost is: "+ ((shirt_price*shirt_quantity)+(sharee_price*shree_quantity)-counts));
        }
        else if(cho==2){
            //int shirt=1200;
            //int sharee=3500;
            int count=0;

            Scanner calc = new Scanner(System.in);
            System.out.println("What is the Price of a Shirt: ");
            int shirt = calc.nextInt();
            System.out.println("What is the Price of a Sharee: ");
            int sharee = calc.nextInt();
            System.out.println("How many Shirt Want to Purchase: ");
            int srt = calc.nextInt();
            System.out.println("How many Sharee Want to Purchase: ");
            int sre = calc.nextInt();
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
        else {
            System.out.println("Opps!! Wrong input. Please Choose just Between 1 & 2.");
        }
    }

}
