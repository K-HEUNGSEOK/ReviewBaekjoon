package inflearn.twopointer_window;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two_Pointer_3 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = 0;
        int rt = 0;
        int sum = 0;
        int ans = 0;
        while (rt < n){
            sum += arr[rt++];

            while (sum > target) {
                sum -= arr[lt++];
            }

            if (sum == target){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}