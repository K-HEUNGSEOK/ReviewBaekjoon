package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_7 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int [] arr = new int[n];
        for(int i = 0;  i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int cnt = 1;
        for(int i = 0 ; i < n ; i ++){
            if (arr[i] == 1){
                ans += cnt;
                cnt ++;
            }else {
                cnt =1;
            }
        }
        System.out.println(ans);

    }
}