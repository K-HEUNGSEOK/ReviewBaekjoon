package inflearn.twopointer_window;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Two_Pointer_2 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int lt1 = 0;
        int lt2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (lt1 < n && lt2 < m) {
            if (a[lt1] == b[lt2]) {
                list.add(a[lt1]);
                lt1++;
                lt2++;
            }else if(a[lt1] > b[lt2]){
                lt2++;
            }else{
                lt1 ++;
            }
        }

        for (Integer integer : list) {
            System.out.print(integer +" ");
        }
    }
}