import java.util.Random;
public class ttt {
    public static void main(String[] args) {
        Random rand=new Random();
        
        int count=0;
        while (count<=10) {
            int Number=rand.nextInt(10);
            System.out.println(Number);
            count++;
            
        }
    }
}
