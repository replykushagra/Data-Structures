package misc.algos;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st1=new Stack<>();
		Stack st2=new Stack<>();
		pushAllElements(st1);
		sortStack(st1,st2);
		
	}

	private static void pushAllElements(Stack st) {
		// TODO Auto-generated method stub
		st.push(-1);
		st.push(0);
		st.push(-11);
		st.push(8);
		st.push(6);
		st.push(22);
	}
	
	private static void sortStack(Stack st1, Stack st2) {
		// TODO Auto-generated method stub
		int temp=0;
		int counter=0;
		while (!st1.empty()) {

			if (st2.empty()) {
				st2.push(st1.pop());
			}
			temp = (int) st1.pop();
			if ((int) st2.peek() < temp) {
				st2.push(temp);
			} else {
				while (!st2.empty() && (int) st2.peek() >= temp) {
					counter++;
					st1.push(st2.pop());
				}
				st2.push(temp);
				for (int i = 0; i < counter; i++) {
					st2.push(st1.pop());
				}
				counter=0;
			}
		}
		System.out.println(st2);
		System.out.println(st1);
	}
}
