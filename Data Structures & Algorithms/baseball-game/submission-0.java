

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                stack.pop();
            }

            else if (op.equals("D")) {
                int last = stack.peek();
                stack.push(last * 2);
            }

            else if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();

                stack.push(last);
                stack.push(last + secondLast);
            }

            else {
                int score = Integer.parseInt(op);
                stack.push(score);
            }
        }

        int sum = 0;

        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}