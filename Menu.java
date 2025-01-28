import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        while (true) {
        Scanner n=new Scanner(System.in);
        // String[] str = {"MENU","1.Calculator","2.Grade calc","3.Multiplication Table ","4.Find even and odd","5.Exit"};
        // for(String s:str){
        //     System.out.println(s);
        // }
        System.out.println("MENU");
        System.out.println("1.Calculator");
        System.out.println("2.Grade calc");
        System.out.println("3.Multiplication Table ");
        System.out.println("4.Find even and odd");
        System.out.println("5.Exit");
        System.out.println("Enter your choice will be (1-5):");
        int no=n.nextInt();
        // System.out.println("your choice is "+ no);
   

            switch (no) {
                case 1:
                    System.out.println("enter a two value:");
                    System.out.print("Enter a value:");
                    int a=n.nextInt();
                    System.out.println("A value: "+a);
                    System.out.print("Enter b value:");
                    int b=n.nextInt();
                    System.out.println("B value: "+b);
                    System.out.print("Enetr your operator (+,-,*,/,%),(1-5):");
                    int v=n.nextInt();
                    switch (v) {
                        case 1:
                             System.out.println(a+b);
                            break;
                        case 2:
                             System.out.println(a-b);
                            break;
                        case 3:
                            System.out.println(a*b);
                           break; 
                        case 4:
                           System.out.println(a/b);
                          break; 
                          case 5:
                          System.out.println(a%b);
                         break;
                        
                        default:
                        System.out.println("invalid choice");
                            break;
                    }
                    
                    break;
                    case 2:
                    System.out.println("enter a two value:");
                    System.out.print("Enter a Grade:");
                    int g=n.nextInt();
                    System.out.println("Grade value: "+g);
                    if (g>90) {
                        System.out.println("A garde");
                    }
                    else if(g>=70&&g<=90){
                        System.out.println("A1 garde");
                    }
                    else if(g>=50&&g<=70){
                        System.out.println("A2 garde");
                    }
                    else if(g>=40&&g<=50){
                        System.out.println("B garde");
                    }
                    else{
                        System.out.println("F garde"); 
                    }
                    break;
                    case 3:
                    System.out.println("enter the multiple no:");
                    int n1=n.nextInt();
                    for(int i=1;i<=10;i++){
                        System.out.println(i+"*"+i*n1+"="+n1*i);
                    }
                    break;
                    case 4:
                    System.out.println("enter the odd or even no:");
                    int oe=n.nextInt();
                    if (oe%2==0) {
                        System.out.println("the value "+ oe + " is even number");
                    } else {
                        System.out.println("the value "+ oe + " is odd number");
                    }
                    break;
                    case 5:
                    System.out.println("program exited");
                     return;
                     
                     
                default:
                    System.out.println("Invalid choice number");
                    break;
            }

            
        }
    }
}