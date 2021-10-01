package com.java.srv.BinaryTree;

import java.util.Stack;

public class BinaryTreePreOrderIterative {
    static Node root;

    public static void main(String[] args) {
        BinaryTreePreOrderIterative bt = new BinaryTreePreOrderIterative();
    bt.createBinaryTree();
    bt.preOrderIterative(root);
    }

    public void createBinaryTree() {
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

    public void preOrderIterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            Node current =stack.pop();
            System.out.println(current.data);
            if (current.right != null) {
             stack.push(current.right);
            }
            if (current.left != null) {
             stack.push(current.left);
            }
        }


    }

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
