# Trie (prefix tree)

The goal is to find the longest common prefix (LCP) between the integers in two arrays, arr1 and arr2, where the integers are compared based on their string representations. The problem is efficiently solved using a Trie (prefix tree), a data structure that helps in storing and searching for common prefixes in multiple strings.

By storing the numbers of arr2 in the Trie and checking the common prefix for each number in arr1, we can efficiently determine the longest common prefix between the two arrays.

Approach
Trie Construction:

We use a Trie (prefix tree) to store the string representations of the integers from arr2.
Each node in the Trie represents a single digit (character '0' to '9'), and edges connect these nodes.
We insert each number from arr2 into the Trie, creating a path of nodes for each character (digit) of the number.
Inserting Numbers:

For each number in arr2, convert it to a string and insert it into the Trie by creating nodes for each digit. This forms a path in the Trie that corresponds to the number.
Finding Longest Common Prefix (LCP):

For each number in arr1, convert it to a string and traverse the Trie to check how many characters match the stored numbers from arr2.
During this traversal, if a character does not exist in the Trie (i.e., there is no matching prefix), we stop and return the length of the matched characters so far.
Track Maximum Length:

As we process each number in arr1, we keep track of the maximum length of the common prefix found between arr1 and arr2.
We maintain a variable maxLen to store the length of the longest common prefix across all numbers in arr1.
Result:

After iterating through all the numbers in arr1, we return maxLen, which holds the length of the longest common prefix between any number in arr1 and the numbers in arr2.
Complexity
Time complexity:O(N*M)
Space complexity:O(N*M)
