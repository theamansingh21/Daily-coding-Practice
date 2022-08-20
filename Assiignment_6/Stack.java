package Assiignment_6;
import java.util.Scanner;
public class Stack {
	int arr[];
	int size;
	int top;
	Scanner sc = new Scanner(System.in);
	Stack() {
		top = -1;
		System.out.println("Enter the size");
		size = sc.nextInt();
		arr = new int[size];
	}
	boolean isempty() {
		if(top == -1) {
			return true;
		}
		else
			return false;
	}
	boolean isFull() {
		if(top == -1) 
			return true;
			else
				return false;
		}
		void push(int x) {
			if(isFull()) {
				System.out.println("stack overflow");
				return;
			}
			top++;
			arr[top] = x;
		}
		int pop() {
			if(isempty()) {
				System.out.println("stack underflow");
				return -1;
			}
			int x = arr[top];
			top--;
			return x;
	}
		int peek() {
			if(isempty()) {
				System.out.println("stack underflow");
				return -1;
			}
			return arr[top];
		}
}
