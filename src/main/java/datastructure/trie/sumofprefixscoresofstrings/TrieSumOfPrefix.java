package datastructure.trie.sumofprefixscoresofstrings;

public class TrieSumOfPrefix {
	
	Node root;
	
	public TrieSumOfPrefix() {
		root = new Node();
	}
	
	public void insert(String word) {
		
		Node node = root;
		for(int i = 0; i< word.length(); i++) {
			char ch = word.charAt(i);
			if(!node.containsKey(ch))
				node.put(ch, new Node());
			
			node = node.get(ch);
			node.incPrefix();
		}
	}
	
	public int sumPrefix(String word) {
		Node node = root;
		int sum = 0;
		
		for(int i = 0; i< word.length(); i++) {
			
			char ch = word.charAt(i);
			if(!node.containsKey(ch))
				return sum;
			
			node = node.get(ch);
			sum += node.prefixes;
		}
		return sum;
	}
	
	public int[] sumTriesOfPrifix(String[] words) {
		int[] sums = new int[words.length]; 

		if(words.length==1) {
			sums = new int [] {words[0].length()};
			System.out.println(sums[0]);
			return sums;
		}
		
		TrieSumOfPrefix trie = new TrieSumOfPrefix();

		for(String word : words) {
			trie.insert(word);
		}
		
		
		for(int i =0; i <words.length ; i++) {
			sums[i] = trie.sumPrefix(words[i]);
			System.out.println(sums[i]);
		}
		return sums;
	}
	
	
	

	public static void main(String[] args) {
		
		TrieSumOfPrefix trie = new TrieSumOfPrefix();
		String[] words = {"abcd"};
		
		String[] wordss = {"abc","ab","bc","b"};
		
		trie.sumTriesOfPrifix(words);
		// output should be 4 
		System.out.println("##############################");
		trie.sumTriesOfPrifix(wordss);
//		output should be 5
//		5
//		4
//		3
//		2
	}

}
