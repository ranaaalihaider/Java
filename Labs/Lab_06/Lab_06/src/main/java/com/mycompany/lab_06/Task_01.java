package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_01 
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Latitude : ");
        double x1=input.nextDouble();
        System.out.print("Enter Longitude : ");
        double y1=input.nextDouble();
        System.out.print("Enter Latitude : ");
        double x2=input.nextDouble();
        System.out.print("Enter Longitude : ");
        double y2=input.nextDouble();
        double radius=6371.01;
        x1=Math.toRadians(x1);
        x2=Math.toRadians(x2);
        y1=Math.toRadians(y1);
        y2=Math.toRadians(y2);
        double d=radius * Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        System.out.println("The distance between the two points is "+d+" km");
    }
    
}
