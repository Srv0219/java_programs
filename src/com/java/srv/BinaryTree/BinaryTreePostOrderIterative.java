package com.java.srv.BinaryTree;

import java.util.Stack;

public class BinaryTreePostOrderIterative {
   static Node root;
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);


        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.right = sixth;
    }
    public void postOrderIterative(Node root ){
        Node current = root;
        Stack<Node> stack = new Stack<>();
        while (current!=null || !stack.isEmpty()){
            if (current!=null){
                stack.push(current);
                current=current.left;
            }
            else {
                Node temp = stack.peek().right;
                if (temp==null){
                    temp= stack.pop();
                    System.out.println(temp.data);
                    while (!stack.isEmpty() && temp == stack.peek().right){
                        temp= stack.pop();
                        System.out.println(temp.data);
                    }
                }
                else {
                    current=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        BinaryTreePostOrderIterative bt = new BinaryTreePostOrderIterative();
        bt.insertBinaryTree();
        bt.postOrderIterative(root);
    }
}
