package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i ++){
            b[i] = sc.nextInt();
        }

        solution(a,b);
    }
    static void solution(int[] a , int[] b){
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < a.length; i ++){
            if (a[i] == 1 && b[i] == 3){
                System.out.println("A");
            }else if(b[i] == 1 && a[i] == 3){
                System.out.println("B");
            }else if(a[i] > b[i]){
                System.out.println("A");
            }else if(b[i] > a[i]){
                System.out.println("B");
            }else {
                System.out.println("D");
            }
        }
    }
}