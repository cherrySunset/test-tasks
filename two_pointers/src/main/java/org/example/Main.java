package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4};
        int t = removeDuplicates(arr);

        System.out.println(Arrays.toString(Arrays.copyOf(arr, t)));
    }

    public static int removeDuplicates(int[] a) {

        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[i]) {
                i++;
                a[i] = a[j];
            }
        }
        return i + 1;
    }
}