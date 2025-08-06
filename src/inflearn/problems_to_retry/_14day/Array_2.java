package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int[][] arr = new int[height][width];
        for(int i = 0 ; i < height; i ++){
            for(int j = 0 ; j < width; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0 ;
        for(int i = 1; i <= width ; i ++){
            for(int j = 1; j <= width; j ++){
                int cnt = 0;
                for(int k = 0 ; k < height; k ++){
                    int ei = 0;
                    int ej = 0;
                    for(int l = 0 ; l < width; l ++){
                        if (arr[k][l] == i){
                            ei = l;
                        }
                        if (arr[k][l] == j){
                            ej = l;
                        }
                    }
                    if (ei < ej){
                        cnt ++;
                    }
                }
                if (cnt == height){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}