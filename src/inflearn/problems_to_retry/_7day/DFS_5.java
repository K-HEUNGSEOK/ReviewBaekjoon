package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_5 {
    static int n, ans;
    static boolean[] ch;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        root.lt = new Node(2);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt = new Node(3);
        ans = Integer.MAX_VALUE;
        BFS(root);
        System.out.println(ans);
    }
    static void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0 ;
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i < len;  i++){
                Node poll = queue.poll();
                if (poll.lt == null && poll.rt == null){
                    ans = Math.min(ans,l);
                    return;
                }
                if (root.lt != null) queue.offer(poll.lt);
                if (root.rt != null) queue.offer(poll.rt);

            }
            l ++;
        }
    }

    static class Node{
        int data;
        Node lt,rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }
}