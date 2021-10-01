package com.java.srv.BinaryTree;

public class BinaryTreeTotalNoOfNodes {
    static Node root;

    public static void main(String[] args) {

        addData();
        System.out.println("No of nodes " + noOfNodes(root));
        ;
    }

    private static int noOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int data = 1 + noOfNodes(root.left) + noOfNodes(root.right);
        return data;
    }

    public static void addData() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node ninth = new Node(8);
        Node tenth = new Node(6);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        third.left = fifth;
        third.right = sixth;
        sixth.left = seventh;
        sixth.right = eighth;
        eighth.left=ninth;
        eighth.right=tenth;
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
