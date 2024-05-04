import java.util.Scanner;
public class task_02 
{
    static String lengthLine="";
    static int length=0;
    static String asciLine="";
    static String vowelsLine="";
    static int vowels=0;

    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        while (true) 
        {
            System.out.print("Enter String or stop to exit: ");
            String line=input.nextLine();
            if (line.toLowerCase().equals("stop")) 
            {
                break;
            }
            else
            {
                lengthLine=stringByLength(line);
                asciLine=stringByAsci(line);
                vowelsLine=stringByVowels(line);

            }
        }
        System.out.println(lengthLine);
        System.out.println(asciLine);
        System.out.println(vowelsLine);
    }
    public static String stringByLength(String line)
    {
        int newLength=line.length();
        if (newLength>length) 
        {
            length=newLength;
            return line;
        }
        else
        {
            return lengthLine;
        }

    }
    public static String stringByAsci(String line)
    {
        if ((line.compareTo(asciLine)>0)) 
        {
            return line;
        }
        else
        {
            return asciLine;
        }
    }
    public static String stringByVowels(String line)
    {
        int newLength=line.length();
        int vowelsCount=0;
        for(int i=0;i<newLength;i++)
        {
            if ("aeiouAEIOU".indexOf(line.charAt(i)) != -1) 
            {
                vowelsCount++;
            }
        }
        if (vowelsCount>vowels) 
        {
            vowels=vowelsCount;
            return line;
        }
        else
        {
            return vowelsLine;
        }
    }
}
