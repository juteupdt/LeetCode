package solutions.No_0601_To_No_0700.No_0700_search_in_a_binary_tree;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * @author Nacht
 * Created on 2019/5/27
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
 *
 * For example,
 *
 * Given the tree:
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * And the value to search: 2
 * You should return this subtree:
 *
 *       2
 *      / \
 *     1   3
 * In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.
 *
 * Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format) as [], not null.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 解题思路:
 * 递归遍历二叉树
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root.val == val){
            return root ;
        }
        TreeNode leftSearch = root.left == null ? null : searchBST(root.left , val);
        TreeNode rightSearch = root.right == null ? null : searchBST(root.right , val);
        return leftSearch != null ? leftSearch : rightSearch ;
    }
}
