public class pattern_One 
{
    public static void main(String[] args) 
    {
        int num=5;
        int i=1;
        int j=1;
        rows(num,i,j);
        
    }
    public static void rows(int num,int i,int j)
    {
        if (i<=num)
        {
            space(i, j, num);
            int k=1;
            star(i, k);
            System.out.println("");
            rows(num, i+1, j);
            
        }

    }
    public static void space (int i,int j,int num)
    {
        if (j<=(num-i) )
        {
            System.out.print(" ");
            space(i, j+1, num);
        }
    }
    public static void star ( int i,int k)
    {
        if (k<=i) 
        {
            System.out.print("* ");
            star(i, k+1);
        }
    }
}
