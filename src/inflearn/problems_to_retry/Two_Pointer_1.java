package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two_Pointer_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int ans = 0;
        int lt = 0;
        for(int i = 0 ; i < n ; i ++){
            sum += arr[i];

            if (sum == m){
                ans ++;
            }

            while (sum > m){
                sum -= arr[lt++];
                if (sum == m){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}