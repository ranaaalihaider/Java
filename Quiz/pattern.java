public class pattern {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++)
        {
            for(int j=6-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.printf("%-2d",k);
            }
            for(int l=2;l<=i;l++)
            {
            System.out.printf("%-2d",l);
            }
            System.out.println("");
        }
    }
}
