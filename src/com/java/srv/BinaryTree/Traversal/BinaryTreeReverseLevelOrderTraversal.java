package com.java.srv.BinaryTree.Traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeReverseLevelOrderTraversal {
    static Node root;
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void addData(){
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
    }
    public static void reverseLevelOrderTraversal(Node root){
        if (root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()){

            Node current = queue.poll();
            stack.push(current.data);

            if (current.left!=null){
                queue.add(current.left);
            }
            if (current.right!=null){
                queue.add(current.right);
            }

        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {

        addData();
        reverseLevelOrderTraversal(root);
    }
}
