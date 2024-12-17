package Arrays.TwoPointers;

public class TwoPointers
{
    public static boolean checkUsingTwoPointer(int [] a, int target)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] + a[j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
    int[] a = {4,5,3,1};
    int target = 10;
    System.out.println(checkUsingTwoPointer(a, target));
    }
}
