class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        char top = 'a';

        for (char c : arr) {
            if (!stack.isEmpty()) top = stack.peek();
            else top = 'a';

            switch (c) {
                case '(', '{', '[':
                    stack.push(c);
                    break;
                case ')':
                    if (top == '(') stack.pop();
                    else stack.push(c);
                    break;
                case '}':
                    if (top == '{') stack.pop();
                    else stack.push(c);
                    break;
                case ']':
                    if (top == '[') stack.pop();
                    else stack.push(c);
                    break; 
            }
        }

        return stack.isEmpty();
    }
}
