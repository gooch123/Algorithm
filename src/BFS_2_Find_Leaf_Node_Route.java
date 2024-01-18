import java.util.LinkedList;
import java.util.Queue;

//7-10.트리 말단 노드까지의 가장 짧은 경로
public class BFS_2_Find_Leaf_Node_Route {

    static class Node{
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static Queue<Node> queue = new LinkedList<>();

//    node.left = new Node(2);
//    node.left.left = new Node(4);
//    node.left.right = new Node(5);
//    node.right = new Node(3);
//    node.right.left = new Node(6);

    public int solution(int level, Node node){
        queue.add(node);
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i<len; i++){
                Node poll = queue.poll();
                if(poll.left == null && poll.right == null)
                    return level;
                if(poll.left != null) queue.add(poll.left);
                if(poll.right != null) queue.add(poll.right);
            }
            level ++;
        }
        return level;
    }

}
