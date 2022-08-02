import java.util.*;

class Array3{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		sc.nextLine();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter the "+(i+1)+"element in array: ");
			arr[i]=sc.nextInt();
			sc.nextLine();
		}
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("Total sum of the elements in the array is :"+sum);
	}
}
