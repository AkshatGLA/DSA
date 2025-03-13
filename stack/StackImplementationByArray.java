package stack;

public class StackImplementationByArray {
    static class Stack {
        int stack[] = new int[10]; // Stack with size 10
        int top = -1; // Top pointer

        // Push operation
        public void push(int value) {
            if (top == stack.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            stack[++top] = value;
        }

        // Pop operation
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1; 
            }
            return stack[top--];
        }

        // Peek operation
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return stack[top];
        }

        // Display stack elements
        public void display() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return;
            }
            System.out.print("Stack Elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: Stack Elements: 10 20 30
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        // System.out.println("Peek: " + stack.peek()); // Output: 30

        // System.out.println("Popped: " + stack.pop()); // Output: 30
        stack.display(); // Output: Stack Elements: 10 20
    }
}
