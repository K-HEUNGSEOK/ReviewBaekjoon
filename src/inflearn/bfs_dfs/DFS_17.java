package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DFS_17 {
    static int n , m , len, answer = Integer.MAX_VALUE;
    static int[] combi; //조합 수 담는 배열
    static ArrayList<Point> pz,hs; //피자집과 그냥 일반집
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); // 조합 만드는 수
        hs = new ArrayList<>();
        pz = new ArrayList<>();
        for(int i = 0; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int temp = sc.nextInt();
                if (temp == 1){
                    hs.add(new Point(i,j));
                }else if(temp == 2){
                    pz.add(new Point(i,j));
                }
            }
        }
        len = pz.size();
        combi = new int[m];
        DFS(0,0);
        System.out.println(answer);
    }
    static void DFS(int v, int start){
        if (v == m){
            int sum = 0 ; //도시 배달거리 (모든 집의 배달거리 더한것)
            for(Point h : hs){ //집이 1개 선택됨
                int dis = Integer.MAX_VALUE; // 각 거리
                for(int i : combi){
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum); //도시 거리중에 제일 작은 값을 갱신
        }else{
            //피자집 개수중에 조합을 뽑는 것임
            for(int i = start; i < len; i ++){
                combi[v] = i; //여기 안에 들어가는 것은 pz 리스트의 get 번호임
                DFS(v + 1, i + 1);
            }
        }
    }

    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    static class Point{
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}