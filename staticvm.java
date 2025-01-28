//this program is static variable and method called
//  each object created, count value store in class (instance of class)


 class count {
   public  static int count=0; //declare variable in static keyword
    count(){
        count++;
        System.out.println(count);
    }
    static void display(){ //declare method in static keyword
        System.out.println(count);
    }
}
public class staticvm {
public static void main(String[] args) {
   
    count c=new count();
    count c1=new count();
    count c2=new count();
    count.display(); //declare method access or called formate  
    System.out.println(count.count);
    //System.err.println(count.count);
}
    
}