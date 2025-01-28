////this program is Parameterized constructor
/// its assign value in constructor method or function
class person{
    String name;
    int age ;
    person(){
       System.out.println("hello");

    }
    person(String n,int a){
        name=n;
        age=a;

    }
}
 
 class ParamerterConstructor {

    public static void main(String[] args) {
        person p =new person("vijay",21);
         p =new person();
        
        // p.person("vijay",21);
        // System.out.println(p.name);
        // System.out.println(p.age);
        

    }
}