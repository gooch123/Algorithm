import java.util.ArrayList;
import java.util.Collections;

//6-7.좌표 정렬
class Point implements Comparable<Point>{
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y; //내림차순
        else return this.x - o.x; //내림차순
    }
}

/**
 * Comparable 인터페이스 또는 직접 비교
 */
public class Point_compare {

//    public void solution(int n, int[][] arr){
//        for (int i =0; i<n; i++){
//            for (int j=0;j<n-i-1;j++)
//                if(arr[j][0] > arr[j+1][0])
//                    swap(j,j+1,arr);
//        }
//        for (int i = 0; i<n-1;i++){
//            for (int j=0;j<n-i-1;j++)
//                if (arr[j][0] == arr[j+1][0] && arr[j][1] > arr[j+1][1])
//                    swap(j,j+1,arr);
//        }
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i][0] + " " + arr[i][1]);
//        }
//    }
//
//    public static void swap(int fir, int sec, int[][] arr){
//        int temp1 = arr[fir][0];
//        int temp2 = arr[fir][1];
//        arr[fir][0] = arr[sec][0];
//        arr[fir][1] = arr[sec][1];
//        arr[sec][0] = temp1;
//        arr[sec][1] = temp2;
//    }

    //Comparable 사용
    public void solution(int n, ArrayList<Point> list){
        Collections.sort(list);
        for (Point point : list) {
            System.out.println(point.x + " " + point.y);
        }
    }

}
