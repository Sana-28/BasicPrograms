package com.bridgelabz.algorithm;

import java.util.Scanner;

//import com.bridgelabz.util.Utility;

public class MergeSortEx{
	
	public static void merge(int array[], int left, int mid, int right)
    {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left+ 1;
        int n2 = right - mid;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = array[left+ i];
        for (int j=0; j<n2; ++j)
            R[j] = array[mid + left+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k =left;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
            	array[k] = L[i];
                i++;
            }
            else
            {
            	array[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
        	array[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
        	array[k] = R[j];
            j++;
            k++;
        }
    }

	public static void sort(int[] array, int left, int right) {
        if (left < right)
        {
            // Find the middle point
            int mid = (left+right)/2;
 
            // Sort first and second halves
            sort(array, left, mid);
            sort(array, mid+1,right);
 
            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }
	static void printArray(int array[])
	{
		int n = array.length;
		for (int i=0; i<n; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of a array:");
		int size=scanner.nextInt();
		int []array=new int[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		sort(array, 0, array.length-1);
		System.out.println("\nSorted array");
		printArray(array);

		scanner.close();
	}

}
