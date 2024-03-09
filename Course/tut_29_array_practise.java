public class tut_29_array_practise {

    public static void main(String[] args) {
        float[] numbers;
        numbers=new float[5];
        numbers[0]=12.2f;        
        numbers[1]=3.2f;        
        numbers[2]=12.8f;        
        numbers[3]=212.4f;        
        numbers[4]=4.7f;   
        float result=0;  
        System.out.print("Your Sum is : ");   
        for(float element:numbers){
            result=(float)(result+element);
        }
        System.out.println(result);
    }
}