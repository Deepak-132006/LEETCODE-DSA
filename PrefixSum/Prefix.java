package PrefixSum;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 2, 4, 6, 8, 10 };
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }
        System.out.print("Prefix: ");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.print("\n"+"Enter 1st index: ");
        int l = sc.nextInt();
        System.out.print("Enter 2nd index: ");
        int r = sc.nextInt();

        if (l == 0) {
            int sum = prefix[r];
            System.out.print("Sum : " + sum);

        } else {
            int sum = prefix[r] - prefix[l - 1];

            System.out.print("\n" + "Sum : " + sum);
        }
    }
}
