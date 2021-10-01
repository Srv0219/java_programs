package com.java.srv.BinaryTree;

import java.util.Stack;

public class BinaryTreeTwoIdenticalTree {
    static Node root;
    static Node root2;

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
        sixth.right=eighth;

       /* Node first = new Node(1);
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
        third.right = seventh;*/

        //second node

        Node first1 = new Node(1);
        Node second2 = new Node(2);
        Node third3 = new Node(3);
        Node fourth4 = new Node(4);
        Node fifth5 = new Node(5);
        Node sixth6 = new Node(6);
        Node seventh7 = new Node(7);
        Node eighth8 = new Node(8);



        root2 = first1;
        first1.left = second2;
        first1.right = third3;
        second2.left = fourth4;
        third3.left = fifth5;
        third3.right = sixth6;
        sixth6.left = seventh7;
        sixth6.right = eighth8;
    }

    public static void identicalTree(Node root, Node root2) {
        if (root == null && root2 == null) {
            return;
        }
        Stack<Node> st = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st.push(root);
        st2.push(root2);


        while (!st.isEmpty() && !st2.isEmpty()) {
            Node curr1 = st.pop();
            Node curr2 = st2.pop();

            if (curr1.data == curr2.data) {
                System.out.println(curr1.data + " " + curr2.data);
                if (curr1.right != null && curr2.right != null) {
                    st.push(curr1.right);
                    st2.push(curr2.right);
                }

                if (curr1.left != null && curr2.left != null) {
                    st.push(curr1.left);
                    st2.push(curr2.left);
                }

            } else {
                System.out.println(" Binary tree are Not identical");
                return;
            }
        }

        System.out.println(" Binary tree are identical");
    }

    public static void main(String[] args) {

        addData();
        identicalTree(root, root2);
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
