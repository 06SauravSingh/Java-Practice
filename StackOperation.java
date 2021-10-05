public class stack {
	int stack[];
	int top,maxsize;
	public stack(int s) {
		maxsize=s;
		top=-1;
		stack=new int[maxsize];
	}
	void push(int ele) {
		if(top==maxsize-1) {
			System.out.println("stack is full");
		}
		else {
			stack[++top]=ele;
			System.out.println("Element "+ele+" pushed into the stack");
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Element "+stack[top--]+" popped from the stack");
		}
	}
	void display() {
		if(top==-1) {
			System.out.println("stack is empty");
		}
		else {
			for(int i=top; i>=0; i--) {
				System.out.println(stack[i]);
				System.out.println();
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		stack s= new stack(n);
		int ch;
		
		do {
			System.out.println("stack operation");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			System.out.println("4..exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1 : System.out.println("Enter the element to be pushed");
			int e=sc.nextInt();
			s.push(e);
			break;
			case 2 : s.pop();
			break;
			case 3 : s.display();
			break;
			case 4 : System.exit(0);
			}
		} while(ch !=4);

	}

}
