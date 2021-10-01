package com.java.srv.BinaryTree.Traversal;

public class BinaryTreeInOrderRecursive {
    static Node root;

    public static void main(String[] args) {
        BinaryTreeInOrderRecursive bt = new BinaryTreeInOrderRecursive();
        bt.addBinaryTree();
        bt.inOrderRecursive(root);

    }
    public void addBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }
    public void inOrderRecursive(Node root){
        if (root==null){
            return;
        }
        inOrderRecursive(root.left);
        System.out.println(root.data);
        inOrderRecursive(root.right);
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

    }
}
