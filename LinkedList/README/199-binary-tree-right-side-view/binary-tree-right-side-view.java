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
class Solution {
    public void  view(TreeNode cur,List<Integer> res,int level){
        if(cur == null)return;
        if(level == res.size()){
            res.add(cur.val);
        }
        view(cur.right,res,level+1);
        view(cur.left,res,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        view(root,result,0);
        return result;
    }
}