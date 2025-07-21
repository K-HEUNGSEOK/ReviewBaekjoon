package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

    public class Sort_3 {
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 1; i <n ; i ++){
                int j;
                int temp = arr[i];
                for(j = i -1; j >= 0; j --){
                    if (arr[j] > temp){
                        arr[j+1] = arr[j];
                    }else{
                        break;
                    }
                }
                arr[j+1] = temp;
            }
            System.out.println(Arrays.toString(arr) );
        }
    }