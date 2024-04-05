package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_06 
{
    static int firstSpace;
    static int lastSpace;
    public static void main (String[] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Word or String : ");
        String line=input.nextLine();  
        firstSpace=line.indexOf(" ");
        lastSpace=line.lastIndexOf(" ");
        if (firstSpace != lastSpace)
        {
            multiWord(line);
        }
        else
        {
            capitalize(line);
        }
        
    }
    public static void capitalize(String lower_case_word)
    {
        String subString=lower_case_word.substring(1);
        String firstWord=lower_case_word.substring(0,1);
        firstWord=firstWord.toUpperCase();
        String finalWord=firstWord.concat(subString);
        System.out.print(finalWord+" ");        
    }    
    public static void multiWord(String line)
    {
        int length=line.length();
        for (int i=0;i<length; i++)
        {
            if (i==firstSpace)
            {
                String word=line.substring(0, i);
                capitalize(word);
                
            }
            else if (i==lastSpace)
            {
                String word=line.substring(i+1);
                capitalize(word);
                
            }

            if(line.charAt(i)==' ')
            {
                int start=i+1;
                for (int j=i+1;j<length;j++)
                {
                    if(line.charAt(j)==' ')
                    {
                        int end=j;
                        String word=line.substring(start,end);
                        capitalize(word);
                        break;
                    }
                }
            }
        }
    }
}
