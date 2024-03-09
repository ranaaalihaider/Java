import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Marks of Eng : ");
        float marks_1=input.nextFloat();
        System.out.print("Enter Marks of Urdu : ");
        float marks_2=input.nextFloat();
        System.out.print("Enter Marks of Phy : ");
        float marks_3=input.nextFloat();
        System.out.print("Enter Marks of Bio : ");
        float marks_4=input.nextFloat();
        System.out.print("Enter Marks of Chem : ");
        float marks_5=input.nextFloat();
        float total_marks=marks_1+marks_2+marks_3+marks_4+marks_5;
        float percentage=total_marks/5;
        System.out.print("Your Percentage is : ");
        System.out.println(percentage+ "%");
    }
}
