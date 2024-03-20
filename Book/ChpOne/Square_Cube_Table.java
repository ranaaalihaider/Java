public class Square_Cube_Table 
{
    public static void main(String[] args) {
        int square=0, cube=0;
        System.out.println("Number Square Cube");
        for(int i=1; i<=10; i++)
        {
            square=i*i;
            cube= square*i;
            System.out.printf("%d%7d%7d\n",i,square,cube);

        }
        
    }
}
