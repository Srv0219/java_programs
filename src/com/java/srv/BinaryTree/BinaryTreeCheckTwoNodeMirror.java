package com.java.srv.BinaryTree;

public class BinaryTreeCheckTwoNodeMirror {
    static Node root1;
    static Node root2;

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


        root1 = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        fourth.right = fifth;


        Node first1 = new Node(1);
        Node second2 = new Node(2);
        Node third3 = new Node(3);
        Node fourth4 = new Node(4);
        Node fifth5 = new Node(5);


        root2 = first1;
        first1.left = third3;
        first1.right = second2;
        second2.right = fourth4;
        fourth4.left = fifth5;
    }

    public static boolean treeMirror(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        Boolean disp = root1.data == root2.data && treeMirror(root1.left, root2.right) && treeMirror(root1.right, root2.left);
        return disp;
    }

    public static void main(String[] args) {
        addData();
        System.out.println( treeMirror(root1, root2));
    }
}
