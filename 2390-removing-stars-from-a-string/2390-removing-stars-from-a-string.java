class Solution {
    public String removeStars(String s) {
     Stack<Character> st = new Stack<>();
     for(char word:s.toCharArray()){
        if(word=='*'){
            if(!st.isEmpty()){
                st.pop();
            }
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