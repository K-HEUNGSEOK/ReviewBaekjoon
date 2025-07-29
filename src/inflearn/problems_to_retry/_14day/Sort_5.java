package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sort_5 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] prime = new boolean[n+1];

        for(int i = 2; i <= (int) Math.sqrt(n) ; i ++){
            if (!prime[i]){
                for(int j = i + i; j <= n ; j += i){
                    prime[j] = true;
                }
            }
        }
        int cnt = 0;
        for(int i = 2; i <= n ; i ++){
            if (!prime[i]){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}