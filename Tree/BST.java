package Tree;

import java.util.ArrayList;

//Balance a Binary Search Tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BST {

    private void inorder(TreeNode root, ArrayList<Integer> in) {
        if (root == null) return;

        inorder(root.left, in);
        in.add(root.val);
        inorder(root.right, in);
    }

    private TreeNode inorderToBST(ArrayList<Integer> in, int s, int e) {
        if (s > e) return null;

        int mid = s + (e - s) / 2;
        TreeNode root = new TreeNode(in.get(mid));

        root.left = inorderToBST(in, s, mid - 1);
        root.right = inorderToBST(in, mid + 1, e);

        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> in = new ArrayList<>();

        inorder(root, in);
        return inorderToBST(in, 0, in.size() - 1);
    }

    public static void main(String[] args) {
        BST sol = new BST();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        TreeNode balancedRoot = sol.balanceBST(root);

        ArrayList<Integer> result = new ArrayList<>();
        sol.inorder(balancedRoot, result);
        System.out.println(result); 
    }
}
