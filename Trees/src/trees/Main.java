package trees;

public class Main {
	
	public static void main(String[] args) {
		BinarySearchTree  bst= new BinarySearchTree();
		bst.insert(25);
		bst.insert(22);
		bst.insert(26);
		bst.insert(21);
		bst.insert(21);
		bst.insert(20);
		bst.insert(30);
		bst.insert(1);
		bst.insert(5);
		bst.insert(10);
		
		System.out.println(bst.get(25));
		System.out.println(bst.get(26));
		System.out.println(bst.get(264));
		
		System.out.println(bst.max());
		System.out.println(bst.min());
		
		bst.traverseInOrder();
		
	
	}
	
	
	
}
