public class tut_32_methods_overloading_practise {
    //When we want no return value from method we use void 
    static void PmName(){
        System.out.println("Imran Khan");

    }
    //in following method static is not used so this will be called by creating object of class in main method
    void Cmname(){
        System.out.println("CM name is Usman Buzdar");
    }
    
    public static void main(String[] args) {
        //Methods Practise
        System.out.println("Hello to Practise");
        PmName();
        tut_32_methods_overloading_practise obj= new tut_32_methods_overloading_practise();
        obj.Cmname();
    }
}
