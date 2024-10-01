package datastructure.minimumoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
//		int[] nums = {2,3,2,4,3};
//		int[] numsDivide =  {9,6,9,3,15};
//		System.out.println(minOperations(nums,numsDivide));
//		System.out.println("expected : "+ 2);
//		int[] nums1 = {4,3,6};
//		int[] numsDivide1 =  {8,2,6,10};
//		System.out.println(minOperations(nums1,numsDivide1));
//		System.out.println("expected : "+ -1);
		
		int[] nums2 = {3,2,6,2,35,5,35,2,5,8,7,3,4};
		int[] numsDivide2 =  {105,70,70,175,105,105,105};
		System.out.println(minOperations(nums2,numsDivide2));
		System.out.println("expected : "+ 6);
	}
	
	public static int minOperations(int[] nums, int[] numsDivide) {
		Arrays.sort(nums);
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i< nums.length ; i++){
            int num = nums[i];
            int val = map.getOrDefault(num,0)+1;
            System.out.println("In num : "+ num + " val : "+val);
            map.put(num, val);
        }
        List<Integer> minOp = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
                int div = m.getKey();
                System.out.println("key : "+ div + " val : "+ m.getValue());
                for(int i = 0; i< numsDivide.length ; i++){
                    int num = numsDivide[i];
                    //System.out.println("div : "+ div + " num : "+ num);
                    if(num%div!=0) {
                        //System.out.println("not div : "+ div + " num : "+ num);
                       if(!minOp.contains(div))
                    	   minOp.add(div);
                    }
                }
                if(!minOp.contains(div))
                	break;
        }
		//System.out.println("minOp size : "+ minOp.size());
        int sum =0;
        for(Integer ab : minOp){
            sum += map.get(ab);
        }
        if(minOp.size()==map.size())
            return -1;
        return sum;
    }

}
