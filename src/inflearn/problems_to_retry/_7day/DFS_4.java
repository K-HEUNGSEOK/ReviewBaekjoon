package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFS_4 {
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
        DFS(root, 0);
        System.out.println(ans);
    }
    static void DFS(Node root, int level){
        if (level >= ans) return;
        if (root.lt == null && root.rt == null){
            ans = Math.min(ans,level);
        }else{
            if (root.lt != null) DFS(root.lt, level + 1);
            if (root.rt != null) DFS(root.rt, level + 1);
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