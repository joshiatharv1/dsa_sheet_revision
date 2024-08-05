public class Ltb_6 {
    public static void main(String gg[]){
        int sum=0;
         Test ft=new Test();
        sum=ft.sum_of_two(4,5);
        System.out.println("The number after addition is "+sum);
    }
}
class Test{
    int sum_of_two(int a, int b){
        return a+b;
    }
}
