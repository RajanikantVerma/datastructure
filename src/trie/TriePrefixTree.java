public class TriePrefixTree {
	
	private Node root;

    public TriePrefixTree() {
        root = new Node();
    }

    public void insert(String num) {
        Node node = root;
        for (char ch : num.toCharArray()) {
            if (!node.containKey(ch)) {
                node.put(new Node(), ch);
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    public void Lcp(String num, int[] maxLen) {
        Node node = root;
        int len = 0;
        for (char ch : num.toCharArray()) {
            if (!node.containKey(ch)) {
                return;
            }
            len++;
            maxLen[0] = Math.max(maxLen[0], len);
            node = node.get(ch);
        }
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        for (int num : arr2) {
            insert(String.valueOf(num));
        }

        int[] maxLen = {0};
        for (int num : arr1) {
            Lcp(String.valueOf(num), maxLen);
        }
        return maxLen[0];
    }
    
   public static void main(String[] args) {
	   TriePrefixTree trie = new TriePrefixTree();
       int[] arr1 = {1, 10, 100};
       int[] arr2 = {1000};
       System.out.println(trie.longestCommonPrefix(arr1, arr2));  // Expected Output: 3
   }
}
