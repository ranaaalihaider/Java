public class tut_29_06_array_practise {
    public static void main(String[] args) {
        //Reversing Array with  Swaping Method
        int [] numbers={11,22,33,44,55,66,77,88,99};
        System.out.print("Without Swap Results are : ");
        for(int element:numbers){
            System.out.print(element+" ");
        }
        int n=Math.floorDiv(numbers.length, 2);
        System.out.println("");
        int length=numbers.length;
        int temp;
        for(int i=0;i<n;i++){
            temp=numbers[i];
            numbers[i]=numbers[length-1-i];
            numbers[length-1-i]=temp;

        }
        System.out.print("With Swap Results are :    ");
        for(int element:numbers){
            System.out.print(element+" ");
        }
    }
}
