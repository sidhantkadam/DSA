package Arrays.Sorts;

import java.util.Arrays;

public class BubbleSort
{
    public static void doBubbleSort(int[] a)
    {
        int temp=0;
        for(int i=a.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {8,5,1,9,4,7,2,3};
        doBubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
