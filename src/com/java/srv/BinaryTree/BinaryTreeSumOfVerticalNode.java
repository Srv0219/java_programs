package com.java.srv.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreeSumOfVerticalNode {
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

    public static void sumOfVerticalNodes(Node root) {
        if (root == null) {
            return;
        }
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int add = 0;
        reccurVerticalNode(root, add, hm);

        for (Map.Entry<Integer, ArrayList<Integer>> set : hm.entrySet()) {
            int val = 0;
            if (set.getValue().size() > 0) {
                ArrayList<Integer> arr = set.getValue();

                for (int i = 0; i < arr.size(); i++) {
                    val = val + arr.get(i);
                }
                System.out.println(set.getKey() + " " + val);
                val = 0;
            } else {
                System.out.println(set.getKey() + " " + set.getValue());
            }


        }
    }

    private static void reccurVerticalNode(Node root, int add, HashMap<Integer, ArrayList<Integer>> hm) {
        if (root == null) {
            return;
        }
        if (hm.get(add) == null) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            hm.put(add, al);
        } else {
            ArrayList<Integer> al = hm.get(add);
            al.add(root.data);
            hm.put(add, al);
        }
        reccurVerticalNode(root.left, add - 1, hm);
        reccurVerticalNode(root.right, add + 1, hm);

    }

    public static void main(String[] args) {
        addData();
        sumOfVerticalNodes(root);

    }
}
