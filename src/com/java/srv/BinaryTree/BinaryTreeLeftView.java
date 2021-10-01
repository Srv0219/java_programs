package com.java.srv.BinaryTree;

public class BinaryTreeLeftView {
    static Node root;
    static  int maxlevel ;
    static int level;

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
        Node ninth = new Node(9);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        fifth.left=eighth;
        fifth.right=ninth;
        third.left = sixth;
        third.right = seventh;
    }

    public static void leftView(Node root, int level) {

        if (root == null) {
            return;
        }
        if (level >= maxlevel) {
            System.out.println(root.data);
            maxlevel++;
        }
        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
    }

    public static void main(String[] args) {

        addData();
        leftView(root,level);
    }
}
