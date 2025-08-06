package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Two_Pointer_1 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();

        int lt = 0;
        int rt = 0;
        int total = 0;
        //작으면 rt ++, 같으면 둘다 ++ 크면 lt ++
        int cnt = 0;
        while (rt < n){
            total += arr[rt++];

            while (total >= m){
                if (total == m){
                    cnt ++;
                }
                total -= arr[lt];
                lt ++;

            }
        }
        System.out.println(cnt);
    }
}