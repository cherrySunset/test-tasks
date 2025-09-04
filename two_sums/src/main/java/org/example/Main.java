package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input target sum");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        Random random = new Random();
        int[] arr = new int[15];
        for (int r = 0; r < arr.length; r++) {
            arr[r] = random.nextInt(20);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        {
            int i = 0;
            int j = arr.length - 1;
            boolean found = false;

            while (i < j) {
                int cur = arr[i] + arr[j];
                if (cur == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                    found = true;
                    break;
                } else if (cur < sum) {
                    i++;
                } else {
                    j--;
                }
            }
            if(!found){
                System.out.println("No pair");
            }
        }
    }
}