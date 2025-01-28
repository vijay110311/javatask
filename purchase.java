import java.util.Scanner;
public class purchase {

    public static void main(String[] args) {
        int rate,discount;
        Scanner v=new Scanner(System.in);
        System.out.println("Enter your purchase value:");
        int value=v.nextInt();
        if (value>8000) {
            discount =value*25/100;
            rate = value-discount;
            System.out.println("discount is 25%:"+discount);
            System.out.println("total bill amount:"+rate);
            
        }
        else if(value>5000&&value<8000){
            discount =value*15/100;
            rate = value-discount;
            System.out.println("discount is 15%:"+discount);
            System.out.println("total bill amount:"+rate);
        }
        else{
            discount =value*5/100;
            rate = value-discount;
            System.out.println("discount is 5%:"+discount);
            System.out.println("total bill amount:"+rate);
        }
    }
}