class Length{
	public static void main(String args[]){
		String s=" hello Java learning is fun thanks Amazon ";
		String strim=s.trim();
		System.out.println("Length before the trim: "+s.length());
		System.out.println("Length after trim: "+strim.length());
		System.out.println("Difference is: "+(s.length()-strim.length()));
	}
}
