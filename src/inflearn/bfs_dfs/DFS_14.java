package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_14 {
    static int[][] graph;
    static int[][] arr;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int width, height, ans;
    static Queue<int[]>  queue= new LinkedList<>();
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();
        graph = new int[height][width];
        arr = new int[height][width];
        ans = 0 ;
        for(int i = 0 ; i < height; i ++){
            for(int j = 0 ; j < width; j ++){
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 1){
                    //1인 부분을 미리 큐에 넣어둔다
                    queue.offer(new int[]{i,j});
                    arr[i][j] = 0;
                }
            }
        }
        BFS();
        boolean flag = true;
        for(int i = 0 ; i < height; i ++){
            for(int j = 0 ; j < width; j ++){
                if (graph[i][j] == 0) flag = false;
                ans = Math.max(ans, arr[i][j]);
            }
        }
        if (flag){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
    static void BFS(){
        int l = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i < len ; i++){
                int[] poll = queue.poll();

                for(int j = 0 ; j < 4; j ++){
                    int nx = poll[0] + dx[j];
                    int ny = poll[1] + dy[j];
                    if (isRange(nx,ny) && graph[nx][ny] == 0){
                        graph[nx][ny] = 1;
                        arr[nx][ny] = l + 1;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
            l ++;
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < height && 0 <= y && y < width;
    }
}