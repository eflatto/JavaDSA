package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {
	
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
		
		System.out.println(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
			
	}
	public void postOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data+" ");
		
	}
	
	public void inOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		
		inOrder(node.left);
		System.out.println(node.data+" ");
		inOrder(node.right);
		
	}
	
	public void levelOrderTraversal(TreeNode node) {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.offer(node);
		
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			
			System.out.println(temp.data+" ");
			
			if(temp.left!= null) {
				queue.offer(temp.left);
				
			}
			if(temp.right!= null) {
				queue.offer(temp.right);
				
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTree2 bt = new BinaryTree2();
		bt.createBinaryTree();
		System.out.println("Inorder traversal:");
        bt.inOrder(bt.root);
        
        System.out.println("\nPreorder traversal:");
        bt.preOrder(bt.root);
        
        System.out.println("\nPostorder traversal:");
        bt.postOrder(bt.root);
		
		
		
		
	}
	

}
