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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> pq = new LinkedList<>();
        pq.offer(root);
        while(!pq.isEmpty()){
            TreeNode node = pq.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left !=null){
                pq.offer(node.left);
            }
            if(node.right != null){
                pq.offer(node.right);
            }
        }
        return root;
    }
}
