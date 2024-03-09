import java.util.Scanner;
public class Task_08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number between 0 and 1000: ");
        String number=input.next();
        //Finding Lngth of Number 
        int length=number.length();
        //FOR LESS THAN 10
        if (length==1) {
            System.out.println("Sum of Single Integer is same which is : "+number);
            
        }
        //FOR NUMBER BETWEEN 10 AND 99
        else if (length==2) {
            char num1=number.charAt(0);
            char num2=number.charAt(1);
            int finalNum1=num1-'0';
            int finalNum2=num2-'0';
            int sumOfNumbers=finalNum1+finalNum2;
            System.out.println("Sum of Your Numbers is : "+sumOfNumbers);
        }
        //FOR NUMBER BETWEEN 100 AND 999
        else if (length==3) {
            char num1=number.charAt(0);
            char num2=number.charAt(1);
            char num3=number.charAt(2);
            int finalNum1=num1-'0';
            int finalNum2=num2-'0';
            int finalNum3=num3-'0';
            int sumOfNumbers=finalNum1+finalNum2+finalNum3;
            System.out.println("Sum of Your Numbers is : "+sumOfNumbers);
            
        }
        //FOR NUMBER BETWEEN 1000 AND 9999
        else if (length==4) {
            char num1=number.charAt(0);
            char num2=number.charAt(1);
            char num3=number.charAt(2);
            char num4=number.charAt(3);
            int finalNum1=num1-'0';
            int finalNum2=num2-'0';
            int finalNum3=num3-'0';
            int finalNum4=num4-'0';
            int sumOfNumbers=finalNum1+finalNum2+finalNum3+finalNum4;
            System.out.println("Sum of Your Numbers is : "+sumOfNumbers);
            
        }
        //ABOVE LIMIT
        else{
            System.out.println("Number is Out of Range.Thanks");

        }

    }
}
