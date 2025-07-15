package inflearn.hash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Hash_5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        //13 15 34 23 45 65 33 11 26 42
        //n - k = 10; 0 1 2
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for(int i = 0 ; i < n ; i ++){
            for(int j = i + 1; j < n ; j ++){
                for(int l = j + 1; l < n ; l ++){
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        if (n < k){
            System.out.println(-1);
            return;
        }        int cnt = 0;
        for (Integer integer : set) {
            cnt ++;
            if (cnt == k){
                System.out.println(integer);
            }
        }
    }

    //[143, 133, 109, 102, 79, 72, 70, 62]
}