public class patternOne 
{
    public static void main(String[] args) 
    {
        int num=5;
        pattern(num);
    }
    public static void pattern(int num)
    {
        if (num==6)
        {
            return;
        }
        else
        {
            for (int i=5;i>num;i--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            pattern(num+1);
        }
    }
}
