package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Hash_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        int cnt = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = i + 1 ; j < n ; j ++){
                for(int m = j + 1; m < n ; m ++){
                    treeSet.add(arr[i] + arr[j] + arr[m]);
                }
            }
        }
        int ans = -1;
        for (Integer nx : treeSet) {
            cnt ++;
            if (cnt == k){
                System.out.println(nx);
                ans = 100;
                break;
            }
        }
        if (ans == -1){
            System.out.println(-1);
        }
    }
}