import java.util.Scanner;
public class sum {
    public static void main(String[] args) 
    {
    Scanner input=new Scanner(System.in);
    int result=0;
    int n=0;   
    System.out.println("Enter Numbers to get sum enter 0 to stop process");
    for (int i=1; i>n; i++)
    {
        System.out.print("Enter Number "+i+" : ");
        int number=input.nextInt();
        if (number==0) 
        {
            n=i+2;
        }
        result+=number;
    }
    System.out.println("Overall sum is "+result);
    }
}
