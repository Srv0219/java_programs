package com.java.srv.BinaryTree.Traversal;

public class BinaryTreePreOrderRecursive {
    static Node root;

    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public void createBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        third.left = fifth;
        third.right = sixth;
        sixth.left = seventh;
        sixth.right=eighth;
    }

    public void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {

        BinaryTreePreOrderRecursive bt =new BinaryTreePreOrderRecursive();
        bt.createBinaryTree();
        bt.preOrder(root);

    }
}
