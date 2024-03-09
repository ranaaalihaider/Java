public class tut_35_methods_practise_03 {
    static int recursive_sum(int number){{
        if (number==1) {
            return 1;
        }
        else{
            return number+recursive_sum(number-1);
        }
    }}
    public static void main(String[] args) {
        //Calling Recursive SUm Function
        System.out.println(recursive_sum(4));
    }
}
