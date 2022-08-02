import java.util.*;

class IpAddress{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your IP address here: ");
		String ip=sc.nextLine();
		String[] spill=ip.split(".");
		for(String a:spill){
			System.out.println(a);
		}
	}
}
