public class Q_29 
{
    public static void main(String[] args) 
    {
        int num=4;
        for(int i=1; i<=num;i++)
        {
            System.out.print("*");

            if (i==1 || i==num) 
            {
                for(int j=1;j<=(num-2);j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int k=1; k<=(num-2);k++)
                {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
    
}
