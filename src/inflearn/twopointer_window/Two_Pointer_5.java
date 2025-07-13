package inflearn.twopointer_window;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two_Pointer_5 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int lt = 0;
        int rt = 0;
        int ans = 0;
        int cnt = 0;

        while (rt < n){
            if (arr[rt] == 0) cnt ++;
            rt ++;
            while (cnt > k){
                if (arr[lt] == 0) cnt --;
                lt ++;
            }
            ans = Math.max(ans,rt-lt);
        }
        System.out.println(ans);
    }
}