public class tut_33_factorail {
    static int factorail(int number){
        int sum;
        if (number==0 || number==1) {
            return 1;
            
        }
        else{
            sum=number*factorail((number-1));
            return sum;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorail(7));
        
    }
}
