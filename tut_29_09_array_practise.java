public class tut_29_09_array_practise {
    public static void main(String[] args) {
        //Find out that array is sorted or not
        boolean status=true;
        int [] number={11,22,33,44,55,66,77,88,99};
        for(int i=0; i<(number.length-1);i++){
            if (number[i]>number[i+1]) {
                status=false;
            }
        }
        if (status==true) {
            System.out.println("Array is Sorted");
            
        }
        else if (status==false) {
            System.out.println("Array is not Sorted");
            
        }
    }
}
