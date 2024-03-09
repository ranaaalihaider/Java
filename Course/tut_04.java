import java.util.Scanner;
public class tut_04 {
    public static void main(String[] args) {
        System.out.println("Nested If Else");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Marks");
        double marks;
        marks=input.nextDouble();
        if (marks>=90) {
            System.out.println("A Grade");
            
        } //1st IF- Ending
        else{ //else of 1st if
            if (marks>=70) { //if of 1st else
                System.out.println("B Grade");
                
            }
            else{ 
                if (marks>=50) {//if of 2nd else
                    System.out.println("Pass");
                    
                }
                else{
                    
                        System.out.println("You are Fail- ");
                        
                    
                }
            }
        }
    }
}
