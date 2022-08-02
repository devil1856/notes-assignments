class StringBuilder1{ //more efficient and reliable
  //mutable strings always use Stringbuffer
  public static void main(String argsp[]){
    StringBuilder sb=new StringBuilder("Hello Amazonians");
  long startTime=System.currentTimeMillis();
    sb.append(" Lets use the Amazon Echo");
    System.out.println(sb);
    //two threads can call it simultanuesly
  int i=0;
    for (i=0;i<10000;i++){
      sb.append("New Amazon product Cart");
        
    }

    System.out.println("time taken builder:"+ (System.currentTimeMillis()-startTime) +"ms");
    StringBuffer sb1=new StringBuffer("Hello Amazonians");

    sb.append(" Lets use the Amazon Echo");
    System.out.println(sb1);
    //two threads can call it simultanuesly

    for (i=0;i<10000;i++){
      sb1.append("New Amazon product Cart");
        
    }
    System.out.println("time taken buffer"+ (System.currentTimeMillis()-startTime) +"ms");
  }
}
