package com.java.srv.BinaryTree;

public class BinaryTreeSumOfNodesTwo {
    static Node root;
    public static void main(String[] args) {
        writeData();
        System.out.println(sumOfNodes(root));
    }

    private static int sumOfNodes(Node root) {
        if (root == null){
            return 0;
        }
        return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
    }

    private static void writeData() {
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

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
