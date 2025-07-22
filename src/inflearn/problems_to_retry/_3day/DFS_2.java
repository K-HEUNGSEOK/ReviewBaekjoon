package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

    public class DFS_2 {
        static int[] ch;
        static int n;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            Node root = new Node(1);
            root.lt = new Node(2);
            root.lt.lt = new Node(4);
            root.lt.rt = new Node(5);
            root.rt = new Node(3);
            root.rt.lt = new Node(6);
            root.rt.rt = new Node(7);
            BFS(root);
        }
        static void BFS(Node root){
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                int len = queue.size();
                for(int i = 0 ; i < len; i ++){
                    Node poll = queue.poll();
                    System.out.print(poll.data+ " ");
                    if (poll.lt != null){
                        queue.offer(poll.lt);
                    }
                    if (poll.rt != null){
                        queue.offer(poll.rt);
                    }
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