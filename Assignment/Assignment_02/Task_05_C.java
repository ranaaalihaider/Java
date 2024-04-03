public class Task_05_C 
{
    public static void main(String[] args) 
    {
        pattern();
    }
    public static void pattern()
    {
        for(int i=1; i<=6;i++)
        {
            for(int j=6;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.printf("%-2d",k);
            }
            System.out.println("");
        }

    }
}
