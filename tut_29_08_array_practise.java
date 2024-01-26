public class tut_29_08_array_practise {
    public static void main(String[] args) {
        //Minimum Number Finder
        int [] number={12,23,4324,123,12,342,12,-44,23,1,12,43,1};
        int min=number[0];
        for(int element:number){
            if (element<min) {
                min=element;
                
            }
        }
        System.out.printf("Your Minimum Number is %d",min);
    }
}
