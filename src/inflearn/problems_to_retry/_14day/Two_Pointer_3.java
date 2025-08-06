package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Two_Pointer_3 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();
        //길이는 rt - lt + 1;

        int cnt = 0; //m 체크
        int ans = 0; //최대길이 체크
        //0을 만나면 cnt 를 올려버리자
        int lt = 0;
        int rt = 0;
        for(int i = 0 ; i < n ; i ++){
            if (arr[rt++] == 0){
                cnt ++;
            }
                while (cnt > m){
                    if (arr[lt++] == 0){
                        cnt --;
                    }
                }
            ans = Math.max(ans, rt-lt);
        }
        System.out.println(ans);
    }
}