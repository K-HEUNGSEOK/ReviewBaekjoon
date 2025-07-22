package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class DFS_1 {
        static int[] ch;
        static int n;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            ch = new int[n+1];
            DFS(1);
        }
        static void DFS(int v){
            if (v > n){
                for(int i = 1; i <= n ; i ++){
                    if (ch[i] == 1){
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }else{
                ch[v] = 1;
                DFS(v+1);
                ch[v] = 0;
                DFS(v+1);
            }
        }
    }