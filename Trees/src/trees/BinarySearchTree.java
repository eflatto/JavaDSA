package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
	private TreeNode root;
	
	private class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public TreeNode insert(TreeNode root,int value) {
		if(root == null) {
			root = new TreeNode(value);
			return root;
		}
		if(value< root.data) {
			root.left = insert(root.left,value);
		}
		else if(value> root.data) {
			root.right = insert(root.right,value);
		}
		return root;
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		
	}
	
	public void levelOrder(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			TreeNode current = queue.poll();
			
			System.out.println(current.data);
			
			if(current.left != null) {
				queue.add(current.left);
			}
			if(current.right != null) {
				queue.add(current.right);
			}
			
		}
		
	}
	
	public TreeNode search(TreeNode root,int key) {
		if(root == null || root.data == key) {
			return root;
		}
		if(key<root.data) {
			return search(root.left,key);
		}
		else {
			return search(root.right,key);
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		
		bst.root = bst.insert(bst.root, 10);
		bst.insert(bst.root, 5);
		bst.insert(bst.root, 60);
		bst.insert(bst.root, 20);
		
		
		
		bst.inOrder(bst.root);
		
		
	}
	
}
