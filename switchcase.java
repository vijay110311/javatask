import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        System.out.println("enter your time:");
        String time=u.nextLine();

        switch (time) {
            case "t":
                System.out.println("Ready to take Tiffen time  7-8");
                break;
                case "l":
                System.out.println("Ready to take lunch time  2-3");
                break;
                case "b":
                System.out.println("Ready to take break time  5-5.30");
                break;
                case "d":
                System.out.println("Ready to take dinner time  8-9");
                break;
        
            default:
            System.out.println("avalotha wrong time");
                break;
        }

    }
}
