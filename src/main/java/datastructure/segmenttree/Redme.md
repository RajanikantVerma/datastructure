# Segment Tree

For all range queries, Segment Tree must always come to the mind.
Post the above, the basic intuition is as follows :
There can be following cases for any intervals :

The new interval can be completely left of the existig interval => newInterval.end <= existingInterval.start.
The new interval can be completely right of the existing interval =>
newInterval.start >= existingInterval.end.
The new interval has an overlap : The overlap can be partial or complete, doesn't matter.
Approach
We would construct a SegmentTree with the following properties :

Intervals with end less than the current interval are present in the left sub-tree.
Interval with start greater than the current interval are present in the right sub-tree.
Post this, we would try to follow the cases mentioned in the intuition one-by-one. Please refer the comments mentioned in the code.

Complexity
Time complexity:
O(n) in worst case scenario as the segment tree can be completely one-sided as well(we are not going to implement re-balancing here).
O(logn) in good scenarios when the binary tree is not skewed.

Space complexity:
O(n), where n represents the number of intervals being passed as an input.

Code
class SegTree {
    int start;
    int end;
    SegTree left;
    SegTree right;
    SegTree(int a,int b) {
        this.start = a;
        this.end = b;
    }
 }
class MyCalendar {
    SegTree root;
    public MyCalendar() {
        root = null;
    }
    
    public boolean book(int start, int end) {
        if(root == null){
            root = new SegTree(start,end);
            return true;
        }
        return update(root,start,end);
    }

    private boolean update(SegTree node,int start,int end) {
        // Three conditions here
        // Case 1: New Interval lies completely before existing interval => Insert in left subtree
        // Case 2: New Interval lies completely after existing interval => Insert in right subtree 
        // Case 3: New Interval has any overlap => return false 

        //Recursion base case 
        if(node ==null)return false;
        // Case 1: New Interval lies completely left of existing interval 
        if(end <= node.start) {
            //Insert in left subtree 
            if(node.left ==null) {
                node.left = new SegTree(start,end);
                return true;
            } else {
                return update(node.left,start,end);
            }
        }

        // Case 2: New interval lies completely right of existing interval 
        if (start >= node.end) {
            //Insert in right subtree 
            if(node.right == null) {
                node.right = new SegTree(start,end);
                return true;
            } else {
                return update(node.right,start,end);
            }
        }

        // Case 3 : Overlapping intervals 
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 class MyCalendar {
    private TreeMap<Integer, Integer> map;

    public MyCalendar() {
        map = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        // Increment the start time and decrement the end time in the map
        map.put(start, map.getOrDefault(start, 0) + 1); // Add 1 to start time
        map.put(end, map.getOrDefault(end, 0) - 1); // Subtract 1 from end time

        int ongoing = 0;
        // Traverse through the map to check for any double booking
        for (int value : map.values()) {
            ongoing += value;
            if (ongoing > 1) {
                // If there's an overlap, revert the changes and return false
                map.put(start, map.get(start) - 1);
                if (map.get(start) == 0) {
                    map.remove(start); // Remove if count is zero
                }
                map.put(end, map.get(end) + 1);
                if (map.get(end) == 0) {
                    map.remove(end); // Remove if count is zero
                }
                return false; // Return false if a double booking is detected
            }
        }

        return true; // Return true if the event is successfully booked
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
 */