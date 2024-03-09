public class tut_27_for_each_loop {
    public static void main(String[] args) {
        int [] marks={10,20,30,40,50};
        float [] marks_float={10,20,30,40,50};
        /* 
        System.out.print("The length of marks array is ");
        System.out.println(marks.length);
        System.out.println(marks_float.length);
        for(int i=0; i<=marks.length;i++){
            System.out.println(marks[i]);
        }*/
        System.out.println("Method 2");
        for(float element:marks_float){
        System.out.println(element);
        }
    
    }
}
