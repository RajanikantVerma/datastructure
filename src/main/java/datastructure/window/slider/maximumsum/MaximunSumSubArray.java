package datastructure.window.slider.maximumsum;

public class MaximunSumSubArray {
	
	
	public int compute(int[] arr, int k) {
		
        if (arr.length <= k) {
            System.out.println("Invalid");
            return -1;
        }
		
		int window_sum = 0;
		int maximum_sum = Integer.MIN_VALUE;
		
		for(int i = 0 ; i< k ; i++) {
			window_sum += arr[i];
		}		
		
		for(int i = k ; i < arr.length ; i++) {
			window_sum += arr[i] - arr[i-k];
			maximum_sum = Math.max(maximum_sum, window_sum);
		}
		return maximum_sum;
	}

	public static void main(String[] args) {
		
		MaximunSumSubArray instance = new MaximunSumSubArray();
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        System.out.println(instance.compute(arr,4)); // answer will be 24
	}

}
