

public class Binary_Search_01 
{
    public static void main(String[] args) 
    {
        int [] numbers={10,15,20,25,30,35,40,45,50};
        int target=25;
        int left=0;
        int right=8;
        int mid=(left+right)/2;
        while (target !=numbers[mid])
        {System.out.println("Hello");
        System.out.println(mid);

            if (target<numbers[mid])
            {
                right=mid;
            }
            else if (target>numbers[mid]) 
            {
                left=mid;
            }
            else if (target==numbers[mid]) 
            {
                System.out.println("hello"+numbers[mid]);
            }
            mid=(left+right)/2;
            
        }
    }
    
}
