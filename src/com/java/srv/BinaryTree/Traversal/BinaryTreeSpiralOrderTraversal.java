package com.java.srv.BinaryTree.Traversal;

import java.util.Stack;

public class BinaryTreeSpiralOrderTraversal {
    static Node root;

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

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public static void spiralOrderTraversal(Node root) {
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        if (root == null) {
            return;
        }
        st1.push(root);
        while (!st1.isEmpty() || !st2.isEmpty()) {
            while (!st1.isEmpty()) {
                Node temp = st1.pop();
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    st2.push(temp.left);
                }
                if (temp.right != null) {
                    st2.push(temp.right);
                }
            }
            System.out.println("");

            while (!st2.isEmpty()) {
                Node temp = st2.pop();
                System.out.print(temp.data + " ");
                if (temp.right != null) {
                    st1.push(temp.right);
                }
                if (temp.left != null) {
                    st1.push(temp.left);
                }
            }

            System.out.println("");

        }

    }

    public static void main(String[] args) {
        addData();
        spiralOrderTraversal(root);
    }
}
