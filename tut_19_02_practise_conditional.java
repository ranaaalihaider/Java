import java.util.Scanner;

public class tut_19_02_practise_conditional {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Income in Lac : ");
        float income=input.nextFloat();
        float tax=0f;
        if (income<2.5) {
            System.out.println("Your tax is 0 rupees");
        }
        else if (income>2.5f && income<5f) {
            tax=(income*0.05f)*100f;
            System.out.println("Your tax amount is : "+tax);
        }
        else if (income>5f && income<10f) {
            tax=(income*0.1f)*100f;
            System.out.println("Your tax amount is : "+tax);   
            
        }
        else{
            tax=(income*0.3f)*100f;
            System.out.println("Your tax amount is : "+tax);   

        }
        
    }
}
