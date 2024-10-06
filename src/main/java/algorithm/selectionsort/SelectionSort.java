package algorithm.selectionsort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {1,23,45,-6,7,9,0,123,34,2,6,89,0,35};
		int n = arr.length;
		int i,j,temp;
		int minIndex;
		for(j =0; j< n-1 ; j++) {
			minIndex = j;
			for(i = j+1; i< n; i++) {
				if(arr[i]<arr[minIndex]) {
					minIndex = i;
				}
			}
			temp = arr[minIndex];					
			arr[minIndex] = arr[j];
			arr[j]= temp;
		}
		
		Arrays.stream(arr).forEach(System.out::println);

	}

}
