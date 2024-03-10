import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=input.nextInt();
        System.out.println(number);
        //023456789
        int d4=number%10;//7   d4
        d4=d4*4;
        number=number/10;//456
        int d3=number%10;//6     d3
        d3=d3*3;
        number=number/10;//45
        int d2=number%10;//5    d2
        d2=d2*2;
        number=number/10;//4  
        int d1=number%10;//4     d1
        d1=d1*1;
        int result=(d4+d3+d2+d1)%11;  //0-10;     5
        //01234567
        //0123456X
    }
}
