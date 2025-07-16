package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two_Pointer_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        int lt = 1;
        int ans = 0;
        for(int i = 1; i <= n / 2 + 1; i ++){
            sum += i;
            if (sum == n){
                ans ++;
            }

            while (sum > n){
                sum -= lt;
                lt ++;
                if (sum == n){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}