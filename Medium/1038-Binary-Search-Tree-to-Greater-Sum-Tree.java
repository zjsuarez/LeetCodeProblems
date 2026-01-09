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
    public TreeNode bstToGst(TreeNode root) {
        TreeNode res = root;
        ArrayList<Integer> values = new ArrayList<>();

        inorderarray(root,values);
        inordermodify(root, values);

        System.out.println(values.size());
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }

        return res;
    }

    public void inorderarray (TreeNode k, ArrayList<Integer> values){
        if(k==null) return;
        values.add(k.val);
        inorderarray(k.left, values);
        inorderarray(k.right, values);
    }

    public void inordermodify (TreeNode k, ArrayList<Integer>values){
        if(k==null) return;

        int value = k.val;
        for (int i = 0; i < values.size(); i++) {
            if(values.get(i)>value){
                k.val+=values.get(i);
            }
        }


        inordermodify(k.left, values);
        inordermodify(k.right, values);
    }
}