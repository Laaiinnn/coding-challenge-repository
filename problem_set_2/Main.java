package problem_set_2;
import java.util.Stack;

public class Main {

    public static boolean isValid(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If the character is a closing bracket, check for a matching opening bracket
            else if (c == ')' || c == '}' || c == ']') {
                // If the stack is empty or the top of the stack doesn't match the corresponding opening bracket, return false
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all opening brackets had matching closing brackets
        return stack.isEmpty();
    }

    // Helper function to check if the pair of brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // Example usage
        String inputString1 = "()[]{}";
        System.out.println(isValid(inputString1)); // Output: true

        String inputString2 = "([)]";
        System.out.println(isValid(inputString2)); // Output: false
    }
}