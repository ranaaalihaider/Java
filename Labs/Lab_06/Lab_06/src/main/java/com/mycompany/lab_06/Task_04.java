package com.mycompany.lab_06;
public class Task_04 
{
    public static void main (String [] args)
    {
        double number=Math.random()*26;
        int finalNumber=(int)number;
        char character = (char) (finalNumber +65);
        System.out.println("Your Random Capital Letter is "+character);
    }

    
}
