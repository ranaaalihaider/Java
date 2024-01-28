public class tut_33_variable_arguments_varags {
    static int sum(int a, int b){
        int total=a+b;
        return total;

    }
    static int sum(int a, int b,int c){
        int total=a+b+c;
        return total;

    }
    //if we are increasing numbers to add we are increasing methods hence methods overloading is increasing
    //now we will solve this
    //following is methods to add multiple numbers by using simple one method
    //recieving all the integers as an array than seprating array than making sum of arrays 
    static int sum_all(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;

    }
    public static void main(String[] args) {
        //Variable Arguments (VarAgs)
        System.out.println("Welcome to VarAgs code");
        System.out.println("sum of 4 and 5 is "+sum(4, 5));
        System.out.println("sum of 2,4 and 5 is "+sum(2,4, 5));
        int total=sum_all(1,4,5,10,30);
        System.out.println(total);

    }
}
