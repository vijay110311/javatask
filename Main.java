import java.util.*;
 class Calculator{
void add(int a,int b){
   
System.out.println("add:"+( a+b));

}
int sub(int a,int b){
    //  System.out.println("sub:"+(a-b));
   return a-b;
   }
}
public class Main {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("enter the A value:");
        int a=n.nextInt();
        System.out.print("enter the B value");
        int b=n.nextInt();
       Calculator C =new Calculator(); 
       C.add(a,b);
       int a1=C.sub(a,b);
       System.out.println(a1);
       System.out.println(a+b);
    }
}
