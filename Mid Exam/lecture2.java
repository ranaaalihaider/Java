import java.util.Scanner;
public class lecture2 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter NUmber : ");
        int num=input.nextInt();
        input.nextLine();
        System.out.println(num+5);
        System.out.println("Enter String");
        String st=input.nextLine();
        System.out.println(st);
        System.out.println("Enter one word");
        String stt=input.next();
        System.out.println(stt);
        System.out.println("Enter float");
        float ff=input.nextFloat();
        System.out.println(ff);
    }
}
