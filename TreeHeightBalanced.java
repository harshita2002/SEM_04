package treeheightbalanced;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;
    BinaryTreeNode(int d)
    {
        data = d;
        left = right = null;
    }
}

public class TreeHeightBalanced {
	BinaryTreeNode root;
	private static class BalanceStatusWithHeight {
		public boolean balanced;
		public int height;
		public BalanceStatusWithHeight(boolean balanced, int height) {
		this.balanced = balanced;
		this.height = height;
		}
		}
		public static boolean isBalanced(BinaryTreeNode tree) {
		return checkBalanced(tree).balanced;
		}

		private static BalanceStatusWithHeight checkBalanced(
		BinaryTreeNode tree) {
			
		if (tree == null) {
		return new BalanceStatusWithHeight(true , -1); // Base case.
		}
		BalanceStatusWithHeight leftResult = checkBalanced(tree.left);
		if (!leftResult.balanced) {
		return leftResult; // Left subtree is not balanced.
		}
		BalanceStatusWithHeight rightResult = checkBalanced(tree.right);
		if (!rightResult.balanced) {
		return rightResult; // Right subtree is not balanced.
		}
		boolean isBalanced = Math.abs(leftResult.height - rightResult.height) <= 1;
		int height = Math.max(leftResult.height , rightResult.height) + 1;
		return new BalanceStatusWithHeight(isBalanced , height);

		}
	    public static void main(String args[])
	    {
	    	TreeHeightBalanced tree = new TreeHeightBalanced();
	        tree.root = new BinaryTreeNode(1);
	        tree.root.left = new BinaryTreeNode(2);
	        tree.root.right = new BinaryTreeNode(3);
	        tree.root.left.left = new BinaryTreeNode(4);
	        tree.root.left.right = new BinaryTreeNode(5);
	        tree.root.left.left.left = new BinaryTreeNode(8);
	        
	        /*          1
	         *         / \         
	         *        2   3
	         *       / \   
	         *      4   5
	         *     /
	         *    8  
	         
	         */
	 
	        if (isBalanced(tree.root))
	            System.out.println("Tree is balanced");
	        else
	            System.out.println("Tree is not balanced");
	    }
}


