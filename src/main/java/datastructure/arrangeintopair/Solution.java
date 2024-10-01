package datastructure.arrangeintopair;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		System.out.println(canArrange(arr1,10));
		System.out.println("expected : "+ false);
		int[] arr2 = {1,2,3,4,5,6};
		System.out.println(canArrange(arr2,7));
		System.out.println("expected : "+ true);
		int[] arr3 = {1,2,3,4,5,10,6,7,8,9};
		System.out.println(canArrange(arr3,5));
		System.out.println("expected : "+ true);

	}
	
	public static boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        int count = 0;
        for(int i =0; i< n-1; i++){
            if(!visited[i]){
                visited[i] = true;
                boolean found = false;
                inner :
                for(int j = i+1; j< n; j++){
                    if(!visited[j]){
                        if((arr[i]+arr[j])%k==0){
                             visited[j] = true;
                             found = true;
                             count++;
                             break inner;
                        }
                    }
                }
                if(found = false)
                    return false;
            }
        }
        if(n/2==count)
            return true;  
        else
            return false; 
    }

}
