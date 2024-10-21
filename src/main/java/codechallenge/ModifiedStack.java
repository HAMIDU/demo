package codechallenge;

import java.util.*;

public class ModifiedStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public ModifiedStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int popped = stack.pop();

        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    public int min() {
        return minStack.peek();
    }

    public int[] solution(String[] operations) {
        List<Integer> result = new ArrayList<>();
        ModifiedStack modifiedStack = new ModifiedStack();

        for (String operation : operations) {
            if (operation.startsWith("push")) {
                int x = Integer.parseInt(operation.split(" ")[1]);
                modifiedStack.push(x);
            } else if (operation.equals("pop")) {
                modifiedStack.pop();
            } else if (operation.equals("min")) {
                result.add(modifiedStack.min());
            }
        }

        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        String[] operations = {"push 10", "min", "push 5", "min", "push 2","push 80","push 1","push 8", "min", "pop", "min", "pop", "min"};
        ModifiedStack modifiedStack = new ModifiedStack();

        int[] result = modifiedStack.solution(operations);
        System.out.println(Arrays.toString(result));

    }
}
