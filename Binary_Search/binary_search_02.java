public class binary_search_02 {
    public static void main(String[] args) {
        int [] values={5,10,15,20,25,30,35,40,45,50,55,60,65,70} ;
        int left=0;
        int length=values.length;
        int right=length-1;
        int target=50;
        int result=0;
        int mid=(right+left)/2;
        while (target !=values[mid]) 
        {
            mid=(right+left)/2;
            if (target<values[mid]) 
            {
                right=mid;
            }
            else if (target>values[mid]) 
            {
                left=mid;
            }
            else if (target==values[mid]) 
            {
                System.out.println(mid);
            }
        }
    }
}
