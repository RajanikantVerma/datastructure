package datastructure.trie;

public class Node {
	boolean flag = false;
    Node[] list = new Node[10];

    void put(Node new_node, char ch) {
        list[ch - '0'] = new_node;
    }

    boolean containKey(char ch) {
        return list[ch - '0'] != null;
    }

    Node get(char ch) {
        return list[ch - '0'];
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }
}
