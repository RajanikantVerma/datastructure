package algorithm.bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,23,45,-6,7,9,0,123,34,2,6,89,0,35};
		int n = arr.length;
		int i,j,temp;
		boolean swaped;
		for(j =0; j< n-1 ; j++) {
			swaped = false;
			for(i = 0; i< n-1-j; i++) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];					
					arr[i]= arr[i+1];
					arr[i+1] = temp;
					swaped = true;
				}
			}
            if (swaped == false)
                break;
		}
		
		Arrays.stream(arr).forEach(System.out::println);
	}

}
