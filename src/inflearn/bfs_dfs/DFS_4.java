package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class DFS_4 {
        static int n;
        static int[] arr;
        static int sum = 0;
        static boolean flag = false;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            arr = new int[n];
            for(int i = 0 ; i < n ; i ++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            //포함을 하고 안하고 하고 안하고
            DFS(0, 0);
            if (flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        static void DFS(int v, int total){
            if (v >= n){
                if (sum - total == total){
                    flag =true;
                }
            }else{
                DFS(v + 1, total + arr[v]);
                DFS(v + 1,total);
            }
        }
    }