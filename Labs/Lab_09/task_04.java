import java.util.Scanner;
public class task_04
{
    static Scanner input=new Scanner(System.in);
    public static void main (String [] args)
    {
        System.out.print("Enter word 1 of length 5 : ");
        String wordOne=input.next();
        input.nextLine();
        System.out.print("Enter word 2 of length 5 : ");
        String wordTwo=input.next();
        input.nextLine();
        boolean status =anagramFinder(wordOne, wordTwo);
        if (status==true) 
        {
            System.out.println("Words are anagrams");
        }
        else
        {
            System.out.println("Words are not anagrams");
        }

    }
    public static boolean anagramFinder(String wordOne,String wordTwo)
    {
        for (int i=0;i<=4;i++)
        {
            if (wordOne.indexOf(wordTwo.charAt(i))==-1) 
            {
                return false;
            }
            if (wordTwo.indexOf(wordOne.charAt(i))==-1) 
            {
                return false;
            }
        }
        return true;
    }
}