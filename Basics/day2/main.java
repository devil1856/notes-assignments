
//Function overloading
//Even with the same function name based on the parameters passed different functions will be executed
//Signatur of the func => return type,no. of parameters,type of parameters,type of parameters and the order of parameters


class Multiplexer{

	//Function with 2 parameters
static int multiply(int a,int b){
	return a*b;
}
	
	//Function with 3 parameters we are overwriting the previous function
static int multiply(int a,int b, int c){
	return a*b*c;
}

static float multiply(float a,float b,float c){
	return a*b*c;
}

}

class Main{
public static void main(String args[]){
	System.out.println("Hello world");
	System.out.println(Multiplexer.multiply(3,4));
	System.out.println(Multiplexer.multiply(3,4,5));
	System.out.println(Multiplexer.multiply(3.0f,4.0f,6.0f));

}
}
