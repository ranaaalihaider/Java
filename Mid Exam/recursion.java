public class recursion 
{
    public static void main(String[] args) 
    {
        int limit=5;
        pattern(limit,limit);
    }
    public static void pattern(int n,int limit)
    {
        if (n==0) 
        {
            
        }
        else
        {
            star(limit-(n-1));
            System.out.println();
            pattern(n-1, limit);
        }

    }
    public static void star(int n)
    {
        if (n==0) 
        {
            
        }
        else
        {
            System.out.print("*");
            star(n-1);
        }
    }
}

