/**
 * java version
 * */

//first submission

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }else{
        while(root.left!=null){
            compare(root);
            root=root.left;
        }
        while(root.right!=null){
            compare(root);
            root=root.right;
        }}
        return root;
    }
    public TreeNode compare(TreeNode root){
        if(root.right.val>root.left.val){
            TreeNode temp;
            temp=root.right;
            root.right=root.left;
            root.left=temp;
        }
        return root;
    }
}




/**
 * 
 * javascript version
 * 
 * */
 

//first submission

/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var invertTree = function inverse(root) {
    var temp=0;
    if(root){
        if(root.left){
            root.left=inverse(root.left);
            if(root.right){
                root.right=inverse(root.right);
                temp=root.left;
                root.left=root.right;
                root.right=temp;
                temp=0;
            }else{
                root.right=root.left;
                root.left=null;
            }
        }else{
             root.right=inverse(root.right);
            if(root.left){
                temp=root.left;
                root.left=root.right;
                root.right=temp;
                temp=0;
            }else{
                root.left=root.right;
                root.right=null;
            }
        }
            
    }
    return root;
    
};
