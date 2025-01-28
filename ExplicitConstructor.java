//this program is explicit default constructor
// Declare a constructor without any parameter 
class person{
    String name;
    int age;
    person(){
        name="vijay";
        age=21;
    }
}
public class ExplicitConstructor {
    public static void main(String[] args) {
        person p =new person();
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
