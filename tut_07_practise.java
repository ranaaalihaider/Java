import java.util.Scanner;

public class tut_07_practise {
    public static void main(String[] args) {
        //in this programme we will take input of name and will print with hello
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name=input.nextLine();
        System.out.println("Hello "+ name+ " Have a Good Day");
        System.out.println("Convert KM to Miles ");
        System.out.println("Enter Reading in Km");
        float km=input.nextFloat();
        float miles=(km)*(0.621f);
        System.out.println("Your Output in miles is");
        System.out.println(miles);
        System.out.println("NOw we will check number is integer or not");
        boolean b1=input.hasNextInt();
        System.out.println(b1);
    }
    
}
