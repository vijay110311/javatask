import java.util.Scanner;
public class forloop1 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the multiple no:");
        int n1=n.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+i*n1+"="+n1*i);
        } 
    }
}
