package silver.binaryserach;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _2805 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr  = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int lt = 0; //모든게 true인 값
        int rt = Integer.MAX_VALUE; //모든게 false 값
        int ans = 0;
        while (lt + 1 < rt){
            int mid = (lt + rt) / 2; //중간값

            //mid를 했을때 남는게 m보다 크면 rt를 줄이고
            //남는게 rt보다 작으면 lt를 옮긴다.
            long sum = 0;
            for(int i = 0 ; i < n ; i ++){
                if (arr[i] > mid){
                    sum += arr[i] - mid;
                }
            }

            if (sum < m){
                rt = mid;
            }else{
                lt = mid;
            }
        }
        System.out.println(lt);
    }
}