package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_5 {
    static boolean [] prime;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime = new boolean[n + 1];
        int ans = 0;

        for(int i = 2; i <= n ; i ++){
            if (!prime[i]){
                for(int j = i * 2 ; j <= n ; j += i){
                    prime[j] = true;
                }
                ans ++;
            }
        }
        System.out.println(ans);
    }
}