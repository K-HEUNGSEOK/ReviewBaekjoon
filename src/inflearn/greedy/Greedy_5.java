package inflearn.greedy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Greedy_5 {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        //다익스트라를 쓰려면 가중치에 음수가 나오면 안됨
        //1. 1번부터 N번까지 dis 배열을 만들고 거기를 Integer.MAX_VALUE 로 초기화
        //2. 반복을 할 때마다 그 중 최소 값은 그거보다 더 작아질 수 없기 때문에 체크표시를 하고 그 간선으로부터 뻗어나간다.
        //3. 원래는 O(n) 인데 priority 큐를 사용하면 O n log n 이 된다.
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for(int i = 0 ; i <= n ; i ++){
            graph.add(new ArrayList<>());
        }
        dis = new int[n + 1];
        Arrays.fill(dis,Integer.MAX_VALUE);

        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt(); //그래프 번호
            int b = sc.nextInt(); //버텍스
            int cost = sc.nextInt(); // 가중치
            graph.get(a).add(new Edge(b,cost));
        }
        solution(1);
        for(int i = 1 ; i<= n ; i ++){
            if (dis[i] == Integer.MAX_VALUE){
                System.out.println(i + " 갈 수 없습니다.");
            }else{
                System.out.println(i + " " + dis[i]);
            }
        }
    }
    static void solution(int v){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v,0)); // 맨 처음 시작지점
        dis[v] = 0;
        while (!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int now = tmp.vex; //현재 간선 번호
            int nowCost = tmp.total; //현재 간선 가중치
            if (nowCost > dis[now]) continue; //현재보다 높으면 최단거리가 아니기에 넘겨버림

            for(Edge ob : graph.get(now)){
                if (dis[ob.vex] > nowCost + ob.total){ //현재 번호가 가중치의 합보다 크면
                    dis[ob.vex] = nowCost + ob.total; //갱신
                    pQ.offer(new Edge(ob.vex,ob.total + nowCost));
                }
            }
        }
    }


    static class Edge implements Comparable<Edge>{
        int vex, total;

        public Edge(int vex, int total) {
            this.vex = vex;
            this.total = total;
        }
        @Override //priority 큐가 이걸 기준으로함
        public int compareTo(Edge o){
            return this.total - o.total;
        }
    }
}