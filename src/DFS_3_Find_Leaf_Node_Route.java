//7-9.Tree 말단 노드까지의 가장 짧은 거리
public class DFS_3_Find_Leaf_Node_Route {

    static class Node{
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

//    node.left = new Node(2);
//    node.left.left = new Node(4);
//    node.left.right = new Node(5);
//    node.right = new Node(3);

    public int solution(int level, Node node){
        if(node == null) return level-1;
        if(node.left == null && node.right == null) return level;
        else return Math.min(solution(level+1,node.left),solution(level+1,node.right));
    }

}
