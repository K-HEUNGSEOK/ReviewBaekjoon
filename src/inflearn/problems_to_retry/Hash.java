package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Hash {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for(int i = 0 ; i < n ; i ++){
            for(int j = i+1 ; j < n ; j ++){
                for(int l = j+1 ; l < n ; l ++){
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        if (k > n){
            System.out.println(-1);
            return;
        }
        for (Integer integer : set) {
            cnt ++;
            if (cnt == k){
                System.out.println(integer);
            }
        }
    }
}