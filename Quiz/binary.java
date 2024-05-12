import java.util.Arrays;
import java.util.Scanner;
public class binary {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) 
    {   
        int [] list={12,14,3000,100,500,15,16,18,900,29,1100,2010,20,31,35,1970,135040,35,48,50};
        Arrays.sort(list);
        int length=list.length;
        int target;
        for(int i=0;i<length;i++)
        {
            System.out.print(list[i]+" ");
        }
        System.out.println();
        System.out.println("Length of array is "+length);
        while (true) 
        {
            System.out.print("Enter Number to find Index Number or 000 to exit: ");
            target=input.nextInt();
            if (target==000) 
            {
                System.out.print("Exit Done");
                break;
            }
            else
            {
                int result=search(list,target);
                if (result==-1) 
                {
                    System.out.println("Your entered Number is not available is list ");
                }
                else
                {
                    System.out.println("Your Index number  is "+result);
                }
                
            }
        }
        
    }
    public static int search(int [] list,int target)
    {
        int left=0;
        int right=(list.length)-1;
        while (left<=right) 
        {
            int mid=(left+right)/2;
            if (target==list[mid]) 
            {
                return mid;
            }
            else if (target<list[mid]) 
            {
                right=mid-1;
            }
            else if (target>list[mid]) 
            {
                left=mid+1;
            }
            
        }
        return -1;
    }
}
