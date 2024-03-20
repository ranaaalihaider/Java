package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_06 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two words seprated by space : ");
        String line=input.nextLine();
        int spaceIndex=line.indexOf(" ");
        String word1=line.substring(0, spaceIndex);
        String word2=line.substring(spaceIndex+1);
        System.out.printf("Your Correct answer is %s %s",word2,word1);

    }
    
}
