import java.util.*;

class Delivery{
	static float totalCost(float a){
		System.out.println("The total amount to pay is: "+a);
		System.out.println("The delivery charge is: "+0.0f);
		return a;
	}

	static float totalCost(float a,float b){
		float cost=a+b;
		System.out.println("The total amount to pay is :"+cost);
		System.out.println("The delivery charge is: "+b);
		return cost;
	}

}

class Cost{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String code="AWS2022";
		System.out.println("Enter the total no. of items: ");
		int items=sc.nextInt();
		float total=0;
		sc.nextLine();
		for(int i=0;i<items;i++){
			System.out.println("Enter the price of item "+i+":");
			int price=sc.nextInt();
			sc.nextLine();
			total = total+price;
		}
		System.out.println("Enter your promo code here: ");
		String userCode=sc.nextLine();
		if(code.equalsIgnoreCase(userCode)){
			total=total*0.8f;
		}
		if(total>500){
			System.out.println(Delivery.totalCost(total));
		}else{
			System.out.println(Delivery.totalCost(total,150.0f));
		}
	}
}
