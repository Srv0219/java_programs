package com.java.srv.BinaryTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class BinaryTreeSumOfAllNodes {
    static Node root;

    public static void main(String[] args) {
        BinaryTreeSumOfAllNodes bt = new BinaryTreeSumOfAllNodes();
        HashSet<Integer> hs = new HashSet<>();
        bt.addBirnaryTree();
        bt.sumAllNodes(root, hs);
    }

    private static void sumAllNodes(Node root, HashSet<Integer> hs) {
        int add =0;
        int i=0;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            Node current = stack.pop();
            hs.add(current.data);
            if (current.right!=null){
                stack.push(current.right);
            }
            if (current.left!=null){
                stack.push(current.left);
            }
        }
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()){
            add=add+ it.next();
        }
        System.out.println(add);
    }

    public void addBirnaryTree() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(9);
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

