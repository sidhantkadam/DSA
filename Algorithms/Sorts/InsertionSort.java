package Algorithms.Sorts;

import java.util.Arrays;

public class InsertionSort
{
    private static void doInsertionSort(int[] a) {
        int temp = 0;
        for(int i=1;i<a.length;i++)
        {
            temp= a[i];
            int j= i-1;
            while (j>-1 && temp<a[j])
            {
                a[j+1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {8,5,1,9,4,7,2,3};
        doInsertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
