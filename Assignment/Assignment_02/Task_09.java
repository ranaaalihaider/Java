import java.util.Scanner;
public class Task_09 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        stringReverse(line);
    }
    public static void stringReverse(String line)
    {
        int lenght=line.length();
        for(int i=(lenght-1);i>=0;i--)
        {
            System.out.print(line.charAt(i));
        }
    }
}
