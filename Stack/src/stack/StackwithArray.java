package stack;

public class StackwithArray {
	
	private int top;
	private int[] arr;
	
	public StackwithArray(int capacity) {
		this.top = -1;
		arr = new int[capacity];
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
		}
		top++;
		arr[top]=data;
	}
	public void pop() {
		if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return;
        }
		top--;
	}
    public boolean isEmpty() {
        return top == -1;
    }
	
	public boolean isFull() {
		return arr.length==size();
	}
	public void display() {
		
		System.out.println("Elements in the stack:");
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public int size() {
		return top +1;
	}
	
	public static void main(String[] args) {
		StackwithArray st = new StackwithArray(10);
		
		st.push(2);
		st.push(3);
		st.push(4);
		st.pop();
		
		st.display();
	}
	
	

}
