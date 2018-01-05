package stacksAndqueues;

public class BalancedBinaryTree {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	 
		TreeNode(int x) {
			val = x;
		}
	}
	
	public boolean isBalanced(TreeNode root){
		if(root == null) return true;
		if(getHeight(root) == -1) return false;
		return true;
	}
	
	//get height at each level and if height difference between left and right subtrees exceeds 1 return -1 else return 0;
	private int getHeight(TreeNode root){
		if(root == null) return 0;
		
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		
		if(leftHeight == -1 || rightHeight == -1) return -1;
		if(Math.abs(leftHeight - rightHeight) > 1) return -1;
		
		return Math.max(leftHeight, rightHeight) + 1;
	}

}
