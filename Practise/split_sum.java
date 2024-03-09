import java.util.Scanner;
public class split_sum {
    public static void main(String[] args) {
        /* 
        int number =321;
        int result =0;
        while (number>0) {
            result=(number%10)+result;
            number=number/10;

            
        }System.out.println(result);*/
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Next Number : ");
        int number=input.nextInt();
        if (number<10) {
            System.out.println("Your Result Number is  : "+number);
            
        }
        else if (number<99) {
            //95     95%10====5
            //checker=5
            int checker=number%10;
            //number=95
            //number=9
            number=number/10;
            //checker=number%10======9%10 ====9
            //(number%10)==9
            //checker=(number%10)+checker;
            //                checker=9+5
            //checker=14
            checker=(number%10)+checker;
            //print(14)
            System.out.println("Yor Result is "+checker);
        }
        else if (number<999) {
            int checker=number%10;
            number=number/10;
            checker=(number%10)+checker;
            number=number/10;
            checker=(number%10)+checker;
            System.out.println("Yor Result is "+checker);
        }
    }
}
