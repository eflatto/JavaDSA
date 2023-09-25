package trees;

public class BST {
	private Node root;
	
	private class Node{
		
		private Node leftChild;
		private Node rightChild;
		private int data;
		
		public Node(int data) {
			this.data = data;
		}
		
		
	}
	
	public void insert(int value) {
		root = insertHelper(value, root);
	}
	
	private Node insertHelper(int value,Node root) { 
		if(root == null) {
			root = new Node(value);
			return root;
		}
		if(value < root.data) {
				root.leftChild = insertHelper(value, root.leftChild);
		}else {
			root.rightChild = insertHelper(value, root.rightChild);
				
		}
		return root;
		
		}
	public void traverseInOrder() {
		if(root!=null) {
			traverseInOrderHelper(root);
		}
	}
	
	public void traverseInOrderHelper(Node root) {
		if (root == null) {
			return;
		}
		if(root.leftChild!= null) {
			traverseInOrderHelper(root.leftChild);
		}
		System.out.println(root.data);
		if(root.rightChild!= null) {
			traverseInOrderHelper(root.rightChild);
		}
	}
	
	public static void main(String[] args) {
		BST bst  = new BST();
		
		bst.insert(0);
		bst.insert(3);
		bst.insert(19);
		bst.insert(6);
		bst.insert(1);
		bst.insert(10);
		bst.insert(4);
		
		bst.traverseInOrder();
	
}

}