public class tut_32_method_overloading {
    //making a method for goodmorning
    static void message(){
        System.out.println("Good Morning");
    }
    //making method with same name but different arguments
    static void message(int a){
        System.out.println("Good Morning "+a+" bro");
    }
    public static void main(String[] args) {
        //Two or more methods can have same names but different parameters
        //calling methods of same name
        int x=500;
        message();
        message(x);
    }
}
