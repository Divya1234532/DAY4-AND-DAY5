class User1
{
    String name;
    String phone;
    String location;
    User1(String name,String phone,String location){
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
    void Displayinfo(String name,String phone,String location)
    {
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
        System.out.println("Location: "+location);
    }
}
class Rideruser extends User1
{
    String vehicletype;

    Rideruser(String name, String phone, String location) {
        super(name, phone, location);
    }

    void Displayride(String name,String phone,String location){
        System.out.println("Ride");
    }
}
class Fooduser extends User1{
    String favfood;

    Fooduser(String name, String phone, String location) {
        super(name, phone, location);
    }

    void DisplayFood(){
        System.out.println("Food");
    }
}
class Parceluser extends User1{
    String weight;

    Parceluser(String name, String phone, String location) {
        super(name, phone, location);
    }

    void Displayparcel(String name,String phone,String location){
        System.out.println("Parcel");
    }
}
public class BookingPlatform {
    public static void main(String args[])
    {
        User1 u=new User1("Divya","739820922","Chennai");
        u.Displayinfo("Divya","739820922","Chennai");
    }

}
