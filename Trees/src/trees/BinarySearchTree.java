package trees;

public class BinarySearchTree {
	//Binary Trees every node has 0,1, or 2 children
	//Children are referred to as left child and right child
	
	//BST can perform insertions, deletions, and retrievals in
	//O(log n) time
	
	//Left child always has smaller value than parent
	//Right child always has a larger value than its parent
	
	//everything on left of root is less than the value of the root 
	//everything on the right of the root is greater than the value of the root
	
	private TreeNode root;

	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	public void traverseInOrder() {
		if(root!=null) {
			
			root.traverseInOrder();
		}
		
		
	}
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		}
		return null;
	}
	
	public int min() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}else {
			return root.min();
		}
	}
	public int max() {
		if(root == null) {
			return Integer.MAX_VALUE;
		}else {
			return root.max();
		}
	}

	

	
}
