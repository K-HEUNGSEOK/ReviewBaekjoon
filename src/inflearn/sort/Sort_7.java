package inflearn.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_7 {
    static int[] arr;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Grid[] grids = new Grid[n];
        for(int i = 0 ; i < n ; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            grids[i] = new Grid(x,y);
        }
        Arrays.sort(grids);

        for (Grid grid : grids) {
            System.out.println(grid.x + " " + grid.y);
        }

    }
    static class Grid implements Comparable<Grid>{
        int x,y;

        public Grid(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Grid o){
            if (this.x == o.x){
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }
}