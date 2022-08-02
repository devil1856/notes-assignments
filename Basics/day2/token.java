import java.util.*;

class Token{
	public static void main(String args[]){
		StringTokenizer st=new StringTokenizer(" AMAZON cloud estd next level of trust ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
