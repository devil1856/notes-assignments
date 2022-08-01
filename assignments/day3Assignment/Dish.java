package assignments.day3Assignment;

class Dish {
    String dishName;
    float rating;
    float price;
    int quantity;
    Dish(String name,float rating,float price,int q){
        this.dishName=name;
        this.rating=rating;
        this.price=price;
        this.quantity=q;
    }
    void reduceQty(int reduceBy){
        System.out.println("Ordered Qty: "+this.quantity);
        this.quantity-=reduceBy;
        System.out.println("After reducing it by "+reduceBy+" units new Qty: "+this.quantity);
    }

    void increaseQty(int increaseBy){
        System.out.println("Ordered Qty: "+this.quantity);
        this.quantity+=increaseBy;
        System.out.println("After increasing it by "+increaseBy+" units new Qty: "+this.quantity);
    }

}

class Order{
    public static void main(String args[]){
        Dish  d1=new Dish("Paneer Biryani",4.5f,200.0f,2);
        Dish  d2=new Dish("Chicken 65",4.0f,321.76f,1);
        d1.reduceQty(1);
        d1.increaseQty(5);
        d2.reduceQty(1);
        d2.increaseQty(9);
        d2.reduceQty(4);
    }
}
