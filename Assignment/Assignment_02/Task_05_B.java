public class Task_05_B
{
    public static void main(String[] args) 
    {
        pattern();
    }
    public static void pattern ()
    {
        for(int i=6; i>=1; i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%-2d",j);
            }
            System.out.println("");
        }
    }
}
