public class toBinary 
{
    public static void main(String[] args) 
    {
        int number=17;
        int result=0;
        while (number !=0) 
        {
            result+=10*(number%2);
            System.out.println(result);
            number/=2;
        }
        System.out.println(result);
    }
}
