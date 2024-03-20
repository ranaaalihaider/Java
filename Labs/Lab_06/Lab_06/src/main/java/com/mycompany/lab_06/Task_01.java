package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_01 
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Latitude");
        double x1=input.nextDouble();
        System.out.println("Enter Longitude");
        double y1=input.nextDouble();
        System.out.println("Enter Latitude");
        double x2=input.nextDouble();
        System.out.println("Enter Longitude");
        double y2=input.nextDouble();
        double radius=6371.01;
        double d=radius * Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        System.out.println(d);
    }
    
}
