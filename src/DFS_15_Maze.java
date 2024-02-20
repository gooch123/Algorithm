//8-10.미로찾기

public class DFS_15_Maze {

    static int answer = 0;
    static int[][] arr;
    static boolean[][] ch;

    public void solution(int x,int y) {
        if(arr[x][y] == 1) return;
        if (x == 7 && y == 7) {
            answer++;
            return;
        }
        if(ch[x][y]) return;
        ch[x][y] = true;
        solution(x+1, y);
        solution(x-1, y);
        solution(x, y+1);
        solution(x, y-1);
        ch[x][y] = false;
    }

//    arr = new int[9][9];
//    ch = new boolean[9][9];
//        for (int i = 0; i < 9; i++) {
//        for (int j = 0; j < 9; j++) {
//            if (i == 0 || i==8 || j==0 || j==8)
//                arr[i][j] = 1;
//            else
//                arr[i][j] = sc.nextInt();
//        }
//    }
//        main.solution(1,1);
//        System.out.println(answer);

}
