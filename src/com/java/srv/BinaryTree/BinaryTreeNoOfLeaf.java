package com.java.srv.BinaryTree;

public class BinaryTreeNoOfLeaf {
    static Node root;

    public static void main(String[] args) {

        addNodes();
        System.out.println("No of Leaf "+noOfLeaf(root));

    }

    public static int noOfLeaf(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int data = noOfLeaf(root.left) + noOfLeaf(root.right);
        return data;
    }

    public static void addNodes() {
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
        sixth.right = eighth;
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
