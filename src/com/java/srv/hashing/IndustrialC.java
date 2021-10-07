package com.java.srv.hashing;

import java.util.PriorityQueue;

public class IndustrialC {
    public static void main(String[] args) {
        int A[] = {5, 19, 8, 1};
        solution(A);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int n = A.length;
        double totalPopulation = 0.0;
        for (int i : A) {
            totalPopulation += i;
        }

        double requiredPopulation = totalPopulation / 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int filters = 0;

        for (int i : A) {
            pq.add(i);
        }

        while (totalPopulation > requiredPopulation && !pq.isEmpty()) {
            int population = pq.peek();
            pq.poll();
            System.out.println("Population is : " + population);
            totalPopulation = totalPopulation - population;

            pq.add((population / 2));
            filters++;
            totalPopulation = totalPopulation + (population / 2);
            System.out.println(totalPopulation);
        }

        return filters;
    }
}
