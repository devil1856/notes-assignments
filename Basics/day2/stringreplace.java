import java.util.*;

class Replace1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String ip = sc.nextLine();
		ip=ip.replace(" ","_");
		System.out.println(ip);
	}
}
