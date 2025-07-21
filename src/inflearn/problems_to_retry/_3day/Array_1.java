package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class Array_1 {

        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean[] prime = new boolean[n + 1];
            int ans = 0;
            prime[0] = true;
            prime[1] = true;

            for(int i = 2; i <= n /2 +1 ; i ++){
                if (!prime[i]){
                    for(int j = i + i ; j <=n ; j += i){
                        prime[j] = true;
                    }
                }
            }
            for(int i = 2; i <= n ; i++){
                if (!prime[i]){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }