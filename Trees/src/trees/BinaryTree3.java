package trees;

import java.util.Stack;

public class BinaryTree3 {
	
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		
		
		root = first;
		
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		
	}
	
	public void preOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.println(temp.data);
			
			if(temp.right!= null) {
				stack.push(temp.right);
			}
			if(temp.left!= null) {
				stack.push(temp.left);
			}
			
		}
			
	}
	
	
	public static void main(String[] args) {
		BinaryTree3 bt = new BinaryTree3();
		bt.createBinaryTree();
        
        System.out.println("\nPreorder traversal:");
        bt.preOrder(bt.root);
		
		
		
	}
	

}
