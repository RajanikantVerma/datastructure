# Sliding Window Technique

The goal is to find the maximum sum of all sub arrays of size K

Applying the sliding window technique: 

We compute the sum of the first k elements out of n terms using a linear loop and store the sum in variable window_sum.
Then we will traverse linearly over the array till it reaches the end and simultaneously keep track of the maximum sum.
To get the current sum of a block of k elements just subtract the first element from the previous block and add the last element of the current block.
The below representation will make it clear how the window slides over the array.

Consider an array arr[] = {5, 2, -1, 0, 3} and value of k = 3 and n = 5

Steps : 

1. This is the initial phase where we have calculated the initial window sum starting from index 0 . At this stage the window sum is 6. Now, we set the maximum_sum as current_window i.e 6. 
2. Now, we slide our window by a unit index. Therefore, now it discards 5 from the window and adds 0 to the window. Hence, we will get our new window sum by subtracting 5 and then adding 0 to it. So, our window sum now becomes 1. Now, we will compare this window sum with the maximum_sum. As it is smaller, we won’t change the maximum_sum. 
3. Similarly, now once again we slide our window by a unit index and obtain the new window sum to be 2. Again we check if this current       window sum is greater than the maximum_sum till now. Once, again it is smaller so we don’t change the maximum_sum. Therefore, for the above array our maximum_sum is 6.


Time Complexity: O(n), where n is the size of input array arr[].

Auxiliary Space: O(1)