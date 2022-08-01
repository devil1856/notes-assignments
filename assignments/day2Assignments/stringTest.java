package assignments;

import java.util.Arrays;

public class stringTest {
    public static void main(String[] args){
        String names="Sarah Jane Taylor,Jhulan Nishit Goswami,Katherine Helen Brunt,Meghann Lanning,Mithali Dorai Raj";
        String[] splitNames=names.split(",");
        for(int i=0;i<splitNames.length;i++){
            String[] temp=splitNames[i].split(" ");
            if(temp.length==3){
                System.out.println(temp[1]);
            } else{
                System.out.println("NULL");
            }
        }
    }
}
