public class sortingArray 
{
    public static void main(String[] args) 
    {
        int [] marks = { 7,8,2,1,3,6};
        for(int i=0;i<marks.length-1;i++)
        {
            for(int j=i+1;j<marks.length;j++)
            {
                if (marks[i]>marks[j]) 
                {
                    int temp=marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array is");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
