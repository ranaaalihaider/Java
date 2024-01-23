public class tut_25_05_practise {
    public static void main(String[] args) {
        //Addition of results of table of 8
        int number=8;
        int result=0;
        int count=1;
        while (count<=10) {
            System.out.println(number+" x "+count+" = "+(number*count));
            result=result+(number*count);
            count=count+1;

            
        }
        System.out.println("Total Sum is : "+result);
    }
}
