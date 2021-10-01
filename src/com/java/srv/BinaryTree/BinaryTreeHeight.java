package com.java.srv.BinaryTree;

public class BinaryTreeHeight {
    static Node root;

    public static void main(String[] args) {
        addData();
        System.out.println(heighOfTree(root));
    }

    private static int heighOfTree(Node root) {
        if (root == null) {
            return -1;
        }
        int a = heighOfTree(root.left);
        int b = heighOfTree(root.right);

        int data = run(a, b) +1;
        return data;

    }

    private static int run(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static void addData() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node ninth = new Node(9);
        Node tenth = new Node(10);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        third.left = fifth;
        third.right = sixth;
        sixth.left = seventh;
        sixth.right = eighth;
        eighth.left = ninth;
        eighth.right = tenth;

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
