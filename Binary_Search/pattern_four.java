public class pattern_four 
{
    public static void main(String[] args) 
    {
        int num=5;
        int limit=num;
        pattern(num, limit);
    }
    public static void pattern(int num,int limit)
    {
        if (num==0)
        {
            
        }
        else
        {
            for (int j=1;j<=num;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            pattern(num-1, limit);
        }
    }
}
