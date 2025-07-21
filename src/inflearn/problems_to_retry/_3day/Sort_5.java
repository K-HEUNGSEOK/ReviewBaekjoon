package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

    public class Sort_5 {

        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i ++ )arr[i] = sc.nextInt();
            int[] copy = Arrays.copyOf(arr,n);
            Arrays.sort(copy);

            for(int i = 0 ; i < n ; i ++){
                if (arr[i] != copy[i]){
                    System.out.print(i+1 +" ");
                }
            }
        }
    }