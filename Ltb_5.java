//Loops both for and while

public class Ltb_5 {
    public static void main(String gg[]){
        int nums[]=new int[5];
        nums[0]=23; // First reference variable
        nums[1]=24; // Second reference variable
        nums[2]=233; // Third reference Variable
        nums[3]=253; // Fourth reference Variable
        nums[4]=248; // Fifth reference variable

        for (int i=0; i<nums.length;i++){
            System.out.println("At index "+i+" we have number "+nums[i]);
        }

        // While Loop
        int y=10;
        while(y>0){
            System.out.println(y);
            y=y-1;
        }

    }
}
