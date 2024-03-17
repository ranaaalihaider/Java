import java.util.Scanner;
public class Q3_17 {
    public static void main(String[] args) {
        System.out.println("Welceome to car average finder !");
        double total_average=0;
        int counter=1;
        while (true) 
        {
            Scanner input= new Scanner(System.in);
            System.out.println("For Car Route "+counter);
            System.out.print("Enter Travelled miles : ");
            int miles=input.nextInt();
            System.out.print("Enter Fuel Consumed : ");
            int fuel=input.nextInt();
            double average= (double) miles/fuel;
            System.out.println("Your car average is "+average);
            System.out.println("Do You want to add more data ?\n1-Yes\n0-No");
            int command=input.nextInt();
            if (command==1)
            {
                total_average=total_average+average;
                System.out.println(counter);
                ++counter;
            }
            else if (command==0) {
                total_average=total_average+average;
                total_average=total_average/counter;
                System.out.println("You Total average for "+counter+" rounds is "+total_average);
                break;
                
            }
            else
            {
                System.out.println("Wrong Command.");
            }

        }
    }
}
