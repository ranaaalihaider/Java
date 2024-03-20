package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_05 
{
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter Word to check it is Palindrom ot not : ");
        String word=input.next();
        int wordLength=word.length();
        wordLength -= 1;
        int length=wordLength/2;
        length -=1;
        boolean palindromeStatus=true;
        for (int i=0; i<=length; i++ )
        {
            char leftCharacter =word.charAt(i);
            char rightCharacter=word.charAt(wordLength-i);
            if (leftCharacter != rightCharacter)
            {
                palindromeStatus=false;
            }

        }
        if (palindromeStatus== true)
        {
            System.out.println("Your Word in Palindrome");
        }
        else
        {
            System.out.println("Your word is not Palindrome");
        }
    }
    
}
