class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st = new Stack<>();
       for(char word:s.toCharArray()){
        if(!st.isEmpty() && word==st.peek()){
            st.pop();
        }else{
            st.push(word);
        }
       }
       
        StringBuilder sb = new StringBuilder();
        for(char word:st){
            sb.append(word);
        }
        return sb.toString();
    }
}