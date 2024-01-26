import java.util.Scanner;

public class tut_29_03_array_practise {
    public static void main(String[] args) {
        int [] numbers={11,22,33,44,55,66,77,88};
        boolean staus=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number to Check in Array : ");
        int checker=input.nextInt();
        int index=0;
        for(int element:numbers){
            if (element==checker) {
                System.out.printf("Yes %d is present in Array at index %d ",checker,index );
                staus=true;
                
            }
            index=index+1;

        }
        if (staus==false) {
            System.out.printf("No %d is not present in Array",checker);
            
        }
    }
}
