public class check 
{
    public static void main(String[] args) {
        System.out.println(demo());
    }
    public static int demo()
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(i);
            if (i==5) 
            {
                return 55555;
            }
        }
        return -222;
    }
}
