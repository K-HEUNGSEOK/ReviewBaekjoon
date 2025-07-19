package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BFS_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        int[] arr = {-1,1,5};

        queue.offer(n);
        int cnt = 0;
        boolean[] check = new boolean[10001];
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0;  i < len ; i ++){
                Integer poll = queue.poll();

                for(int j = 0 ; j < 3; j ++){
                    int nx = poll + arr[j];
                    if (nx == m){
                        System.out.println(cnt + 1);
                        return;
                    }

                    if (nx >= 0 && !check[nx]){
                        check[nx] = true;
                        queue.offer(nx);
                    }
                }
            }
            cnt ++;
        }
        System.out.println(cnt);
    }
}