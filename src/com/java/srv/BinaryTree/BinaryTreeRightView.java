package com.java.srv.BinaryTree;

public class BinaryTreeRightView {
    static Node root;
    static int level;
    static int maxlevel;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
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

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        third.left = fifth;
        third.right = sixth;
        sixth.left = seventh;
        sixth.right = eighth;
    }

    public static void leftView(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level >= maxlevel) {
            System.out.println(root.data);
            maxlevel++;
        }
        leftView(root.right, level + 1);
        leftView(root.left, level + 1);
    }

    public static void main(String[] args) {
        addData();
        leftView(root, level);
    }
}
