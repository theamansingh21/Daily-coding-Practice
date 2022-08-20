package Assiignment_6;

public class StackLinkedList {
	Node top;
	boolean isEmpty() {
		if(top == null)
			return true;
		else 
			return false;
	}
	void push(int x) {
		Node q= new Node();
		q.data = x;
		q.Next = top;
		top = q;
	}
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		int  x = top.data;
		top = top.Next;
		return x;
	}
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		return top.data;
	}
}
 


