package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class DFS_4 {
        static int[] ch;
        static int n;
        static int ans = Integer.MAX_VALUE;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            Node root = new Node(1);
            root.lt = new Node(2);
            root.rt = new Node(3);
            root.lt.lt = new Node(4);
            root.lt.rt = new Node(5);
            DFS(root,0);
            System.out.println(ans);
        }
        static void DFS(Node root, int v){
            if (root.lt == null && root.rt == null){
                ans = Math.min(ans, v);
            }else{
                if (root.lt != null){
                    DFS(root.lt , v + 1);
                }
                if (root.rt != null){
                    DFS(root.rt , v + 1);
                }
            }
        }
        static class Node{
            int data;
            Node lt, rt;

            public Node(int data) {
                this.data = data;
                this.lt = null;
                this.rt = null;
            }
        }
    }