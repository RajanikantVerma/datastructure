package datastructure.arrangeintopair;

import java.util.Arrays;
import java.util.List;

public class SecondFindingElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,2,6,2,25,5,35,2,5,8,7,3,4);
		
		Integer secondSmallest = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println(secondSmallest);
		
		int secondLargest = list.stream().distinct().sorted((a,b) -> b.compareTo(a))
				.skip(1).findFirst().orElse(null);
		System.out.println(secondLargest);
		
		int[] arr = {3,5,6,-78,-3,7};

		int len = arr.length;
		int maxSum = 0;
		for(int i = 0; i< len; i++){
		    int sum = 0;
		    for(int j= i ; j < len ; j++){
			   sum += arr[j];
			   if(maxSum< sum){
					maxSum = sum;
				}
			}
		}
		
		System.out.println(maxSum);

		
	}

}
