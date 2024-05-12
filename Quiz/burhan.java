import java.util.Scanner;
public class burhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (true) 
        {
           
            System.out.println("Enter integer: ");
            int n = input.nextInt();
            for(int i = 2; i <= n/2; i++){
                if(n % i == 0){
                    System.out.println("number is prime");
                    break;
                }
                else{
                    count++;
                }
            }
          
        }
        System.out.println(count);
    }
}
