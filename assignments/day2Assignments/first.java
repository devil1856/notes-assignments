package assignments;

//different promo codes have different discounts -- problem statement

import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your promo code here: ");
        String promoCode=sc.nextLine();
        System.out.println("Enter the total bill amount: ");
        float billAmount=sc.nextFloat();
        sc.nextLine();
        if(promoCode.equalsIgnoreCase("PROMO1") & billAmount>100){
            billAmount=billAmount*0.8f;
        } else if (promoCode.equalsIgnoreCase("PROMO2") & billAmount>500){
            billAmount=billAmount*0.75f;
        } else if(promoCode.equalsIgnoreCase("PROMO3") & billAmount>1000){
            billAmount=billAmount*0.5f;
        } else{
            System.out.println("Sorry the promo you enter is not valid anymore.");
        }
        System.out.println("The total bill amount is: "+billAmount);
    }
}
