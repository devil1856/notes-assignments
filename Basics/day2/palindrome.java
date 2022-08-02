import java.util.*;

class Palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you wish to check:");
		String ip=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		sb.append(ip);
		String out=sb.reverse().toString();
		if(ip.equalsIgnoreCase(out)){
			System.out.println("It is palindrome string");
		}else {
			System.out.println("It is not a palindrome string");
		}
	}
}
