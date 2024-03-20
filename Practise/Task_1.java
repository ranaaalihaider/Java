import java.util.Scanner;

public class Task_1 
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       /*  System.out.println("Enter Latitude");
        double x1=input.nextDouble();
        System.out.println("Enter Longitude");
        double y1=input.nextDouble();
        System.out.println("Enter Latitude");
        double x2=input.nextDouble();
        System.out.println("Enter Longitude");
        double y2=input.nextDouble();
        */
        double x1=39.55;
        double x2=41.5;
        double y1=-116.25;
        double y2=87.37;
        double radius=6371.01;
        double d=radius * Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        System.out.println(d);
        
    }
}
