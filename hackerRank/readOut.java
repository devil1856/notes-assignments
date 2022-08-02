package hackerRank;

import java.util.Scanner;

public class readOut {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        sc.nextLine();
        double pi=sc.nextDouble();
        sc.nextLine();
        String msg=sc.nextLine();
        System.out.println("String: "+msg);
        System.out.println("Double: "+pi);
        System.out.println("Int: "+num1);
        sc.close();
    }
}
