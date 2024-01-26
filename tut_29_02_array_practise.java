public class tut_29_02_array_practise{
    public static void main(String[] args) {
        float [] numbers={12.2f,0.8f,4.0f,1.5f,1.5f};
        float result=0;
        System.out.println("Numbers are Given Below : ");
        for(float element:numbers){
            System.out.println(element);
            result=result+element;
        
        }
        System.out.print("Sum of Numbers is : ");
        System.out.print(result);
    }
}