package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input words line: ");
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();

        System.out.println("Input coincidence amount: ");
        Scanner n = new Scanner(System.in);
        int coincidence = n.nextInt();

        String[] arr = inputLine.replace("!", "")
                .replace("?", "")
                .replace(",", "")
                .replace(".", "")
                .replace(";", "")
                .replace(":", "").toLowerCase().split("\\s+");

        Map<String, Integer> map = new HashMap<>();
        for (String word : arr) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> q : map.entrySet()) {
            if (q.getValue() == coincidence) {
                System.out.println(q.getKey());
            }
        }
    }
}