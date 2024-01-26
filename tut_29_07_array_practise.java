public class tut_29_07_array_practise {

    public static void main(String[] args) {
        //Finding Max Number in array
        int [] numbers={12,23,43,45,212,34,545,999,1413};
        int max=0;
        for(int element:numbers){
            if (element>max) {
                max=element;
                
            }
        }
        System.out.printf("Your maximum number is %d",max);
    }
}