package Algorithms.Sorts;

import java.util.Arrays;

public class SelectionSort
{
    public static void doSelectionSort(int[] a)
    {
        int temp = 0;
        for(int i =0;i<a.length;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[minIndex])
                {
                    minIndex = j;
                }
            }
            if(i!=minIndex)
            {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {8,5,1,9,4,7,2,3};
        doSelectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
