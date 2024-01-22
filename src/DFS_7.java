//8-2.바둑이 승차
public class DFS_7 {

    static int dest;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;

    public void solution(int sum, int index){
        if(sum > answer && sum <= dest){
            answer = sum;
        }
        if(index < arr.length){
            solution(sum + arr[index],index+1);
            solution(sum ,index+1);
        }
    }

//    dest = sc.nextInt();
//    int n = sc.nextInt();
//    arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//        arr[i] = sc.nextInt();
//    }
//        main.solution(0,0);
//        System.out.println(answer);

}
