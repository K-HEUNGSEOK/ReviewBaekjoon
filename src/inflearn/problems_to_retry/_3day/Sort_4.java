package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

    public class Sort_4 {
        static int[] arr;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            arr = new int[n];

            for(int i = 0; i < m; i ++){
                int num = sc.nextInt();
                //miss
                if (isCheck(num) == -1){
                    cacheMiss(num);
                }else{
                    //hit
                    cacheHit(num);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        static void cacheHit(int n){
            for(int i = isCheck(n); i >= 1; i --){
                arr[i] = arr[i-1];
            }
            arr[0] = n;
        }
        static void cacheMiss(int n){
            for(int i = arr.length-1; i >= 1; i --){
                arr[i] = arr[i-1];
            }
            arr[0] = n;
        }
        static int isCheck(int n ){
            for(int i = 0 ; i < arr.length ; i ++){
                if (arr[i] ==n){
                    return i;
                }
            }
            return -1;
        }
    }