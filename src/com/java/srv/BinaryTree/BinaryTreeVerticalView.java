package com.java.srv.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreeVerticalView {
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

    public static void printVertical(Node root) {
        if (root == null) {
            return;
        }
        int add = 0;
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();


        getVerticalOrder(root, add, hm);
        for (Map.Entry<Integer, ArrayList<Integer>> set : hm.entrySet()) {
            System.out.println(set.getKey()+" "+set.getValue());
        }

    }

    private static void getVerticalOrder(Node root, int add, HashMap<Integer, ArrayList<Integer>> hm) {

        if (root == null) {
            return;
        }
        if (hm.get(add) == null) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            hm.put(add, al);
        } else {
            ArrayList<Integer> al = hm.get(add);
            //System.out.println(hm.get(add));
            al.add(root.data);
            hm.put(add, al);
        }
        getVerticalOrder(root.left, add - 1, hm);
        getVerticalOrder(root.right, add + 1, hm);
    }


    public static void main(String[] args) {
        addData();
        printVertical(root);
    }
}
