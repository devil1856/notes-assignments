package hackerRank;
//package that contains scanner that we can use to send input
import java.util.*;
public class scannerTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        sc.close();
        System.out.println("Name: "+name+" Age: "+age);
    }

}
