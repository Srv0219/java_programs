package com.java.srv.BinaryTree;

import java.util.HashSet;
import java.util.Stack;

public class BinaryTreeNumOfNodes {
    static Node root;

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        BinaryTreeNumOfNodes bt = new BinaryTreeNumOfNodes();
        bt.addBinaryData();
        bt.countNodes(root, hs);
    }

    private void countNodes(Node root, HashSet<Integer> hs) {


        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node current = stack.pop();
         //   System.out.println(current.data);
            hs.add(current.data);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }

        System.out.println(" Num of nodes = "+ hs.size());

    }

    public void addBinaryData() {
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
