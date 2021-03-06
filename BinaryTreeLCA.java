package com.graphs;

public class BinaryTreeLCA {


	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}



	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if(root == null)
			return root;

		return lca(root, p.val, q.val);

	}

	private TreeNode lca(TreeNode root, int p, int q){

		if(root != null){

			if(root.val > p && root.val > q) // root greater than both then left subtree
				return lca(root.left, p,q);

			if(root.val <p && root.val < q) //root less than both then right subtree 
				return lca(root.right, p, q);                
		}
		return root;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
