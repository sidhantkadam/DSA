package Arrays.Searching;


public class BinarySearch
{
    private static int binarySearch(int[] a, int find)
    {
        int low = 0;
        int high = a.length-1;

        while(low <= high)
        {
            int midPosition = (low+high)/2;
            int mid = a[midPosition];
            if (mid == find) {
                return midPosition;
            } else if (find > mid) {
                low = midPosition + 1;
            } else
            {
                high = midPosition - 1;
            }
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] a, int find, int left, int right)
    {
        while (left <= right)
        {
            int midPosition = (left+right)/2;
            int mid = a[midPosition];
            if(mid == find)
            {
                return midPosition;
            } else if (find > mid) {
                return binarySearchRecursive(a, find, midPosition +1, right);
            }
            else
            {
                return binarySearchRecursive(a, find, left, midPosition+1);
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
    int[] a = {1,2,4,7,9,24,36,58};
    int find = 58;
    System.out.println(binarySearch(a, find));
    int left = 0;
    int right = a.length-1;
    System.out.println(binarySearchRecursive(a, find, left, right));
    }
}
