class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String ch : operations) {
            if (ch.equals("D")) {
                int temp = stack.peek() * 2;
                stack.push(temp);
            } else if (ch.equals("+")) {
                int top = stack.pop();
                int newTop = stack.peek();
                stack.push(top);
                stack.push(top + newTop);
            } else if (ch.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }
        int sum = 0;
        for (int digit : stack) {
            sum += digit;
        }
        return sum;
    }
}