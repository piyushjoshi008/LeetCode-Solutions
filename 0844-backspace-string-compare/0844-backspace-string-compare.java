class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char word:s.toCharArray()){
            if(word=='#'){
                if(!st1.isEmpty()){
                st1.pop();
                }
            }else{
                st1.push(word);
            }
        }
        for(char word:t.toCharArray()){
            if(word=='#'){
                if(!st2.isEmpty()){
                st2.pop();
                }
            }else{
                st2.push(word);
            }
        }
        return st1.equals(st2);
    }
}