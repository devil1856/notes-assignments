package assignments;

import java.util.Scanner;

//Recursion
//A function calling itself based on a set condition is called recursion
public class recurTest {

    //sample of recursion code
    static int recur(int n){
        if(n<1) return 0;
        if (n%10 == 7) return  1 + recur(n/10);
        else return recur(n/10);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you wish to check: ");
        int out = recur(sc.nextInt());
        System.out.println(out);
    }
}
