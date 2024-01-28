class mannual_class {
    //created a class other than file name 
    //created method in this class with name time_teller
    void time_teller(){
        System.out.println("I Dont know what is time ");
    }
    
}
public class tut_32_methods_overloading_practise_02 {
    public static void main(String[] args) {
        System.out.println("Time is given below");
        //making object from class that we created manually
        mannual_class obj=new mannual_class();
        //calling that method using object from other class 
        obj.time_teller();

    }
}
