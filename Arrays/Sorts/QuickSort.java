package Arrays.Sorts;

import java.util.Arrays;

public class QuickSort
{
    public static void quickSort(int[] a, int l, int h)
    {
        if(l>=h)
        {
            return;
        }
        int pivot = a[h];

        int leftPoint = partition(a, l, h, pivot);
        quickSort(a,l,leftPoint-1);
        quickSort(a,leftPoint+1, h);
    }

    private static int partition(int[] a, int l, int h, int pivot) {
        int leftPoint = l;
        int rightPoint = h;

        while(leftPoint < rightPoint)
        {
            if(a[leftPoint]<= pivot && leftPoint < rightPoint)
            {
                leftPoint++;
            } else if (a[rightPoint] >= pivot && leftPoint < rightPoint) {
                rightPoint--;
            }
            swap(a, leftPoint, rightPoint);
        }
        swap(a, leftPoint, h);
        return leftPoint;
    }

    private static void swap(int[] a, int index1, int index2)
    {
        int temp = a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }

    public static void main(String[] args) {
        int [] a = {2,4,8,1,5,6,3,7};
        int l=0,h=a.length-1;
        System.out.println("Before Sorting : " + Arrays.toString(a));
        quickSort(a,l,h);
        System.out.println("After Sorting : " + Arrays.toString(a));
    }
}
