package inflearn.twopointer_window;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two_Pointer_4 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i ++){
            arr[i] = i +1;
        }
        int lt = 0;
        int rt = 0;
        int sum = 0;
        int ans =0;
        while (rt < n /2 + 1){
            sum += arr[rt++];
            //같으면?
            if (sum == n){
                ans ++;
            }
            while (sum >= n){
                sum -= arr[lt++];
                if (sum == n){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}