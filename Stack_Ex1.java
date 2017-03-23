import java.util.Scanner;
import java.util.Stack;
 
public class Stack_Ex1 {
	
	Scanner scan;
	Stack<String> stack;
	
	int n;
 
	void push() {
		
		scan = span class="keyword"=new Scanner(System.in);
		stack = new Stack<String>();
		
		System.out.println("Stack Push (Insert)");
		
		System.out.println("\nEnter 'n' value :");
		n = scan.nextInt();
		
		System.out.println("Enter the data - PUSH");
 
		for(int i=0; i<n; i++) {
			
			stack.push(scan.next());
		}
	}
	
	void display() {
		
		System.out.println("\nThe Stack");
 
		for(int i=0; i<stack.size(); i++) {
			
			System.out.println(stack.get(i));
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Stack_Ex1 obj = new Stack_Ex1();
		
		obj.push();
		obj.display();
	}
}