package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_6 {
    static boolean [] prime;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0 ; i < n; i ++){
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
        }

        //소수체크를 미리 해둔다.
        boolean[] prime = new boolean[100001];
        prime[1] = true;
        for(int i = 2; i < prime.length; i ++){
            if (!prime[i]){
                for(int j = i * 2; j < prime.length; j +=i){
                    prime[j] = true;
                }
            }
        }
        //이제 뒤집은게 소수인지 봐보자
        for(int i = 0 ; i < n ; i ++){
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            int num = Integer.parseInt(sb.reverse().toString());
            if (!prime[num]){
                System.out.print(num +" ");
            }
        }

    }
}