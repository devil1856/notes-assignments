package assignments.day3Assignment;

class UserData {
    String name;
    String email;
    String phone;
    String address;
    String gender;
    UserData(String name,String email,String phone,String address,String gender){
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.gender=gender;
    }
    void printData(){
        System.out.println("Name: "+this.name.toUpperCase()+" Email: "+this.email);
        System.out.println("Phone: "+this.phone+" Gender: "+this.gender);
        System.out.println("Address: "+this.address);
        System.out.println("=================================================");
    }
}

class Check1{
    public static void main(String[] args){
        UserData u1=new UserData("Mashuka","youareanidiot@iwonttell.com","000000000","afhpifs;fyhowefyw","F");
        UserData u2=new UserData("Yo Yo Honey singh","grammylove@iwonttell.com","777777777","asphalt king streer","M");
        u1.printData();
        u2.printData();
    }
}