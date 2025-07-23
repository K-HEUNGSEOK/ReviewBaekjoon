package inflearn.problems_to_retry._7day;

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
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();

        int lt = 0;
        int cnt = 0;
        int sum = 0;
        for(int rt = 0 ; rt < n ; rt ++){
            sum += arr[rt];

            while (sum >= m){
                if (sum == m){
                    cnt ++;
                }
                sum -= arr[lt++];
            }
        }
        System.out.println(cnt);
    }
}