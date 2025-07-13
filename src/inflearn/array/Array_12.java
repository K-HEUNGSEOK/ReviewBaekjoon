package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_12 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //가로
        int m = sc.nextInt(); // 세로
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) { //1번 ~ n 번까지의 멘토
            for (int j = 1; j <= n; j++) { // 1번 ~ n 번까지의 멘티
                int cnt = 0; //m번의 테스트 동안 다 이겨야함
                for (int k = 0; k < m; k++) { // 시험의 갯수동안
                    int pi = 0; // i번이 몇등인가?
                    int pj = 0; // j번이 몇등인가?
                    for (int l = 0; l < n; l++) { //i가 다 j보다 큰가?
                        if (arr[k][l] == i) pi = l;
                        if (arr[k][l] == j) pj = l;
                    }
                    if (pi > pj){
                        cnt ++;
                    }
                }
                if (cnt >= m){ //cnt가 m번이면 다 이긴거임
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}