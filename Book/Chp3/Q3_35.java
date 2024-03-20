import java.util.Scanner;
public class Q3_35 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int len1=input.nextInt();
        int len2=input.nextInt();
        int len3=input.nextInt();
        if ((len1+len2)>len3) 
        {
            if ((len2+len3)>len1)
            {
                if ((len1+len3)>len2)
                {
                    System.out.println("Yes its a triangle ");
                }
                else
                {
                    System.out.println("Nooo");
                }
            }
            else
            {
                System.out.println("Noo");
            }
        }
        else
        {
            System.out.println("No");
        }
    }
}
