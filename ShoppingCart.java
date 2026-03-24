class product{
    int id;
    String name;
    double price;
    int quantity;
    product(int id,String name,double price,int quantity){//parameterised
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    double getTotalPrice()
    {
        return price*quantity;
    }
    void display()
    {
        System.out.print("ID: "+id+"\n"+"Product Name: "+name+"\n"+"Price: "+price+"\n"+"Quantity: "+quantity+"\n"+"Total: "+getTotalPrice()+"\n");

    }
}
public class Task1 {
    public static void main(String args[])
    {
        product p1=new product(1,"Monitor",50000.0,1);
        product p2=new product(2,"Mouse",200.0,3);
        product p3=new product(3,"Keyboard",1500.0,2);
        product[] cart={p1,p2,p3};
        double grandtotal=0.0;
        for(product p:cart)
        {
            p.display();
            grandtotal+=p.getTotalPrice();
        }
        System.out.println();
        System.out.println("GrandTotal: "+grandtotal);

    }
}
