package com.java.srv.BinaryTree;

class Node {
    int data;
    Node left;
    Node right;
}

class BinaryTree{

    public Node createNewNode(int val){
        Node node = new Node();
        node.data=val;
        node.left=null;
        node.right=null;
        return node;
    }

}

public class BinaryTreeExecution {
   static Node root;

    public static void main(String[] args) {
          BinaryTree tree = new BinaryTree();
          root=tree.createNewNode(2);
          root.left= tree.createNewNode(7);
        root.right= tree.createNewNode(5);
        root.left.left= tree.createNewNode(2);
        root.left.right= tree.createNewNode(6);
        root.left.right.left=tree.createNewNode(5);
        root.left.right.left=tree.createNewNode(11);
        root.right.right= tree.createNewNode(9);
        root.right.right.left= tree.createNewNode(4);


    }
}
