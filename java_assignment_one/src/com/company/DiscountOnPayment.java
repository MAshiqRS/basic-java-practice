//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

package com.company;

import java.lang.String;
import java.util.*;

public class DiscountOnPayment {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Give the Price of the Laptop: ");
        int lp= a.nextInt();

        System.out.println("Choose the payment Selection option\nOption 1 for Choose Payment Method using digits\nOption 2 for Choose Payment Method by Typing");
        int c = a.nextInt();
        if(c==1){
            System.out.println("For Cash payment Press 1\nFor Digital Payment Press 2");
             int b=a.nextInt();
            if(b==1){
                System.out.println("You got 10% Discount On Cash Payment.\nYour Discount Value is: "+((lp*10)/100) + "\nAfter 10% discount Your Purchase Price: "+(lp-((lp*10)/100)));
            }
            else if(b==2){
                System.out.println("You didn't get any Discount due to Digital Payment.\nYour Purchase Price is : "+lp);
            }
            else{
                System.out.println("Sorry !! Wrong Input");
            }
        }
        else if(c==2){
            System.out.println("For Cash payment Type 'cash payment'\nFor Digital Payment type 'digital payment'");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
//            System.out.println(s);
            if(s.equalsIgnoreCase("cash payment")){
                System.out.println("You got 10% Discount On Cash Payment.\nYour Discount Value is: "+((lp*10)/100) + "\nAfter 10% discount Your Purchase Price: "+(lp-((lp*10)/100)));
            }
            else if(s.equalsIgnoreCase("digital payment")){

                System.out.println("You didn't get any Discount due to Digital Payment.\nYour Purchase Price is : "+lp);
            }
            else {
                System.out.println("Sorry!! Wrong Input");
            }
        }
        else{
            System.out.println("Sorry!! Wrong Input.");
        }

    }
}
