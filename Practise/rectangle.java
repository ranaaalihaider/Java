public class rectangle {
    public static void main(String[] args) {
        int n=15;
        for(int i=1;i<=n; i++)
        {
            System.out.print("--");
            
        }
        System.out.println();
        for (int j=1; j<=n/2; j++)
        {
            for(int k=1;k<=1;k++)
            {
            System.out.print("|");
            }
            for (int l=1 ;l<=((n*2)-2);l++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=1;k++)
            {
            System.out.print("|");
            }
            System.out.println();
        }
        for(int i=1;i<=(n); i++)
        {
            System.out.print("--");
            
        }
        
        
    }
}
