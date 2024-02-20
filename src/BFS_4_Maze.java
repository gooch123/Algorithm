import java.util.LinkedList;
import java.util.Queue;

//8-11.미로의 최단거리 통로
public class BFS_4_Maze {

    static int answer = -1;
    static int[][] arr;
    static boolean[][] ch;

    public void solution() {
        Queue<Main.Point> queue = new LinkedList<>();
        queue.add(new Main.Point(1,1));
        int count = 0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Main.Point poll = queue.poll();
                int px = poll.x;
                int py = poll.y;
                ch[px][py] = true;
                if(arr[px][py] == 1) continue;
                if (px == 7 && py == 7) {
                    answer = count;
                    return;
                }
                for (int j = 0; j < 4; j++) {
                    if(!ch[px+dx[j]][py+dy[j]])
                        queue.add(new Main.Point(px + dx[j], py + dy[j]));
                }
            }
            count ++;
        }
    }

    static class Point{
        public int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
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
//        main.solution();
//        System.out.println(answer);

}
