
class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        // First pass: Remove invalid closing brackets
        for (char word : s.toCharArray()) {

            if (word == '(') {
                count++;
                sb.append(word);
            }
            else if (word == ')') {
                if (count > 0) {
                    count--;
                    sb.append(word);
                }
            }
            else {
                sb.append(word);
            }
        }

        // Second pass: Remove extra opening brackets
        StringBuilder ans = new StringBuilder();

        for (int i = sb.length() - 1; i >= 0; i--) {

            char ch = sb.charAt(i);

            if (ch == '(' && count > 0) {
                count--;
                continue;
            }

            ans.append(ch);
        }

        return ans.reverse().toString();
    }
}
