import java.util.Scanner;

public class tut_06_making_percentage {
    //making programme to calculate marks percentage of students
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1  :");
        int subject1 =input.nextInt();
        System.out.println("Enter Marks of Subject 2  :");
        int subject2 =input.nextInt();
        System.out.println("Enter Marks of Subject 3  :");
        int subject3 =input.nextInt();
        System.out.println("Enter Marks of Subject 4  :");
        int subject4 =input.nextInt();
        System.out.println("Enter Marks of Subject 5  :");
        int subject5 =input.nextInt();
        int result= subject1+subject2+subject3+subject4+subject5;
        System.out.println("Your Total Marks are : ");
        System.out.println(result);
        float percentage=result/5;
        System.out.println("Your Percentage is");
        System.out.println(percentage);
    }
    
}
