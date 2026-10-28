// ==========================================================
// 917. Reverse Only Letters
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 27%)
// Memory     : 42.4 MB (Beats 94%)
// Link       : https://leetcode.com/problems/reverse-only-letters/
// ==========================================================

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        StringBuilder letters = new StringBuilder();

        for (char c : ch) {
            if (Character.isLetter(c)) {
                letters.append(c);
            }
        }

        letters.reverse();

        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                ch[i] = letters.charAt(index++);
            }
        }

        return new String(ch);
    }
}