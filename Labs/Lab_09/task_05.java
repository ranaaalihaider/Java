import java.util.Scanner;
public class task_05 
{
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) 
    {
        areaCalculator();
    }
    public static void areaCalculator()
    {
        System.out.println("Enter 1 for Area of Circle : ");
        System.out.println("Enter 2 for Area of Triangle : ");
        System.out.println("Enter 3 for Area of Rectangle : ");
        int command=input.nextInt();
        input.nextLine();
        if (command==0) 
        {
            
        }
        else if (command==1) 
        {
            System.out.println("Enter radius of circle");
            double radius=input.nextInt();
            input.nextLine();
            System.out.println("Area is ");
            System.out.println(area(radius));
            System.out.println("Enter 0 for main menu -1 for exit ");
            int decision=input.nextInt();
            input.nextLine();
            if (decision==0) 
            {
                areaCalculator();
            }
        }
        else if (command==2) 
        {
            System.out.println("Enter Base of Triangle");
            double base=input.nextDouble();
            input.nextLine();
            System.out.println("Enter Height of Triangle");
            double height=input.nextDouble();
            input.nextLine();
            System.out.println("Area is ");
            System.out.println(area(base,height));
            System.out.println("Enter 0 for main menu -1 for exit ");
            int decision=input.nextInt();
            input.nextLine();
            if (decision==0) 
            {
                areaCalculator();
            }
        }
        else if (command==3) 
        {
            System.out.println("Enter Length : ");
            int length=input.nextInt();
            input.nextLine();
            System.out.println("Enter Width : ");
            int width=input.nextInt();
            input.nextLine();
            area(length, width);
        }

    }
    public static double area(double radius)
    {
        double result = 2*(3.14)*((radius*radius));
        return result;
    }
    public static double area(double base, double height)
    {
        double result=(0.5)*base*height;
        return result;
    }
    public static void area(int length,int width)
    {
        int result= length*width;
        System.out.println(result);

        System.out.println("Enter 0 for main menu -1 for exit ");
        int decision=input.nextInt();
        input.nextLine();
        if (decision==0) 
        {
            areaCalculator();
        }
    }
}
