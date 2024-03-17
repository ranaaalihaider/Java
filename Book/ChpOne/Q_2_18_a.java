public class Q_2_18_a {
    public static void main(String[] args) {
        int n =20;
        for (int i=1; i<=n;i++)
        {   //for first row
            if (i==1)
            {
                for(int j=1; j<=(n);j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
            }
            System.out.print("*");
            for(int k=1;k<=(n-2);k++)
            {
                System.out.print(" ");
            }
            System.out.println("*");

        }
        for(int j=1; j<=(n);j++)
            {
                System.out.print("*");
                
            }
    }
}
