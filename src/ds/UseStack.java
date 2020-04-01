package ds;

import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("NY");
        stack.push("PA");
        stack.push("FL");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        Stack<Integer> num = new Stack<Integer>();
        num.push(10);
        System.out.println(num.pop());

    }
}
