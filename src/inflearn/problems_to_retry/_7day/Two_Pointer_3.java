package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two_Pointer_3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();

        int ans = 0;

        int lt = 0;
        int cnt = 0 ;

        for(int i = 0 ; i < n ; i ++){
            if (arr[i] == 0){
                cnt ++;
            }
            if (cnt > m){
                ans = Math.max(ans, i - lt );
            }
            while (cnt > m){
                if (arr[lt++] == 0){
                    cnt --;
                }
            }
        }
        System.out.println(ans);
    }
}