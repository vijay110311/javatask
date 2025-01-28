//this program is implicit default constructor 
//its assign a default value for non initialize variables by java compiler
class person{
    String name;
    int age ;
}
public class ImplicitConstructor {
    public static void main(String[] args) {
        person p =new person();
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
