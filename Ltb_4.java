import java.util.Scanner;

public class Ltb_4 {
    public static void main(String gg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter todays day");
        String a=sc.next();
        switch(a){
            case "Mon":
                System.out.println("Todays a Monday");
                break;
            case "Tue":
                System.out.println("Todays a Tuesday");
                break;
            case "Wed":
                System.out.println("Todays a Wednesday");
                break;
            case "Thur":
                System.out.println("Todays a Thursday");
                break;
            case "Fri":
                System.out.println("Todays a Friday");
                break;
            case "Sat":
                System.out.println("Todays a Saturday");
                break;
            case "Sun":
                System.out.println("Todays a Sunday");
                break;
            default:
                System.out.println("Enter a valid day");
        }
    }
}
