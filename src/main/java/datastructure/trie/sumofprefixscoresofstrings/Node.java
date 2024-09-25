package datastructure.trie.sumofprefixscoresofstrings;

public class Node {
	
    Node[] links;
    int prefixes;

    Node(){
        links = new Node[26];
        prefixes=0;
    }

    boolean containsKey(char c){
        return links[c-'a']!=null;
    }

    Node get(char c){
        return links[c-'a'];
    }

    void put(char c, Node node){
        links[c-'a'] = node;
    }

    void incPrefix(){
        prefixes++;            
    }

    int prefixCount(){
        return prefixes;
    }

}
