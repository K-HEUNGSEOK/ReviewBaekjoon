package inflearn.twopointer_window;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Two_Pointer_1 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m ; i ++){
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        int lt1 =0;
        int lt2 =0;
        while (lt1 < n && lt2 < m){
            if (a[lt1] == b[lt2]) {
                list.add(a[lt1]);
                list.add(b[lt2]);
                lt1++;
                lt2 ++;
            }
            else if (a[lt1] < b[lt2]){
                list.add(a[lt1]);
                lt1 ++;
            }else{
                list.add(b[lt2]);
                lt2 ++;
            }
        }
        while (lt1 < n){
            list.add(a[lt1++]);
        }
        while (lt2 < m){
            list.add(b[lt2++]);
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}