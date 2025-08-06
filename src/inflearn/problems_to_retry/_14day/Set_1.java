package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Set_1 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i ++) arr[i] = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for(int i = 0 ; i < n ; i ++){
            for(int j = i+1 ; j < n ; j ++){
                for(int l = j+1 ; l < n ; l++){
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        boolean flag = false;
        for (Integer i : set) {
            cnt ++;
            if (cnt ==k){
                System.out.println(i);
                flag = true;
                return;

            }
        }
        if (!flag) System.out.println(-1);
    }
}