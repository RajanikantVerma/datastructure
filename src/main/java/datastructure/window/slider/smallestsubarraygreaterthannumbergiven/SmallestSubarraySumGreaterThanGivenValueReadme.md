# Sliding Window Technique 

start and end to mark the starting and ending of the window.

1. keep incrementing the end pointer till the sum of the window is less than or equal to X. 
2. When, the sum of window becomes greater than X, we record the length of the window and start moving the start pointer till the sum of window becomes smaller than or equal to X. 
3. Now, when the sum becomes smaller than or equal to X, again start incrementing the end pointer. 
4. Keep on moving the start and end pointer till we have reached the end of the array.