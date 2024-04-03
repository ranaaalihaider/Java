import java.util.Scanner;
public class factorial2 {
    public static void main(String arags[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int number =input.nextInt();
        int factorial=fact(number);
        System.out.println(factorial);
    }
    public static int fact(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }

    }


    
}
