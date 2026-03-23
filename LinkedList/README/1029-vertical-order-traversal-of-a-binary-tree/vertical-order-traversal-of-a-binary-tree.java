/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair {
    TreeNode node;
    int row, col;

    Pair(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0, 0));

        while(!q.isEmpty()){
            Pair p = q.poll();

            map.putIfAbsent(p.col, new ArrayList<>());
            map.get(p.col).add(new int[]{p.row, p.node.val});

            if(p.node.left != null)
                q.add(new Pair(p.node.left, p.row+1, p.col-1));

            if(p.node.right != null)
                q.add(new Pair(p.node.right, p.row+1, p.col+1));
        }

        List<List<Integer>> res = new ArrayList<>();

        for(List<int[]> list : map.values()){
            
            Collections.sort(list, (a,b) -> {
                if(a[0] == b[0]) return a[1] - b[1];
                return a[0] - b[0];
            });

            List<Integer> temp = new ArrayList<>();
            for(int[] arr : list){
                temp.add(arr[1]);
            }

            res.add(temp);
        }

        return res;
    }
}