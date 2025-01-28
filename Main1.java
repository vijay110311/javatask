class area{
    double pi=3.14;
    int r;
    int a,l,b;
    
    void square(){
        System.out.println("Sruare value:"+(a*a));
    }
    void rect(){
        System.out.println("Reactangle:"+l*b);
    }
    void circle(){
        System.out.println("Circle:"+pi*r*r);
    }

}
class periarea{
    double pi=3.14;
    int r;
    int a,l,b;
    
    void square(){
        System.out.println("perimeter Square:"+(a*a*a*a));
    }
    void rect(){
        System.out.println("perimeter rectangle:"+2*l+b);
    }
    void circle(){
        System.out.println("perimeter circle:"+(2*pi)*r);
    }

}
public class Main1 {
public static void main(String[] args) {
    area a=new area();
    periarea p=new periarea();
    a.a=10;
    a.b=20;
    a.l=10;
    a.r=20;
    a.circle();
    a.square();;
    a.rect();
    p.a=10;
    p.b=10;
    p.l=10;
    p.r=20;
    p.circle();
    p.square();;
    p.rect();

}
    
}