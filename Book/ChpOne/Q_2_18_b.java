
public class Q_2_18_b {
    public static void main(String[] args) {
        int l=0;
        for (int i=1; i<=4; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print("s");
            }
            for( int k=1;k<=1;k++)
            {
                System.out.print("*");

            }
            if (i%2==0) {
                l=l+1;
                
            }
            for(;l<=9;l++)
            {
                System.out.print("t");
            }
            System.out.println();
        }
    }
    
}
