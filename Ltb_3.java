import java.util.Scanner;

public class Ltb_3 {
    public static void main( String gg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you age");
        int a=sc.nextInt();
        if(a>20){
            System.out.println("You can drive from now on ");
        }
        else if(a==20)
        {
            System.out.println("Correct age to drive is 20");
        }
        else{
            System.out.println("No dont drive");
        }
    }
}
