import java.util.*;

class Generate{
	public static void main(String args[]){
		String[] names=new String[]{"Jessica Harris","Sarah Tucker","Tonya Evans"};
		for (int i=0;i<names.length;i++){
			String low=names[i].toLowerCase().replace(" ",".");
			System.out.println(low+"@amazon.com");
		}
	}
}
