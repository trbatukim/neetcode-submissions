class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            try {
                int val = Integer.parseInt(tokens[i]);
                stack.push(val);
            } catch (NumberFormatException e) {
                char operand = tokens[i].toCharArray()[0];
                int second = stack.pop();
                int first = stack.pop();
                int inter = 0;

                switch (operand) {
                    case '+':
                        inter = first + second;
                        break;
                    case '-':
                        inter = first - second;
                        break;
                    case '*':
                        inter = first * second;
                        break;
                    case '/':
                        inter = first / second;
                        break;
                }

                stack.push(inter);
            }
        }

        return stack.pop();
    }
}
