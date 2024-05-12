public class lecture3 {
    public static void main(String[] args) {

        num(10);

    }
    public static void num(int n)
    {
        if (n==0) 
        {
        }
        else
        {
            pattern(n-1);
            System.out.println();
            num(n-1);
        
        }

    }
    public static void pattern (int num)
    {
        if (num==0) 
        {
            
        }
        else
        {
            System.out.print("*");
            pattern(num-1);
        }
    }
}
