import java.util.Scanner;;
public class tut_05 {
    public static void main(String[] args) {
        System.out.println("Enter Marks");
        Scanner input= new Scanner(System.in);
        double marks= input.nextDouble();
        if (marks>50) {
            if (marks>70) {
                System.out.println("A Grade");
                
            }
            else{
                System.out.println("Grade B");
            }

        }
        else{
            System.out.println("You are Fail");
        }
    }
}
