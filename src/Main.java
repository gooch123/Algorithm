import java.util.*;

public class Main {

    public void solution(int n, ArrayList<Point> list){
        Collections.sort(list);
        for (Point point : list) {
            System.out.println(point.x + " " + point.y);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for (int i=0;i<n;i++){
            points.add(new Point(sc.nextInt(),sc.nextInt()));
        }
        main.solution(n,points);
    }
}