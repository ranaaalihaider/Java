public class factorial 
{
    public static void main(String[] args) 
    {
        int n=5;
        int result=facc(n);
        System.out.println(result);
    }
    public static int facc (int n)
    {
        if (n==1) 
        {
            return 1;
        }
        else
        {
            return n*facc(n-1);
        }
    }
}
