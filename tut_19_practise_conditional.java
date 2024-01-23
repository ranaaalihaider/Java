import java.util.Scanner;

public class tut_19_practise_conditional {
    public static void main(String[] args) {
        //check student is pass or not student should have at least 33% in each subject and 40% overall
        Scanner input=new Scanner(System.in);
        System.out.println("Enter English Marks");
        int english=input.nextInt();
        System.out.println("Enter Urdu Marks");
        int urdu=input.nextInt();
        System.out.println("Enter Math Marks");
        int math=input.nextInt();
        float percentage=(english+urdu+math)/3f;
        System.out.println("Your Percentage is : "+percentage);
        if (english>=33 &urdu>=33 &&math>=33) {
            if (percentage>=40f) {
                System.out.println("Student is Pass");
            }
            else{
                System.out.println("Student is fail overall not 40%");
            }
            }
        else{
            System.out.println("student is fail as not secured at least 33% in all subjects");
        }
    }
}
