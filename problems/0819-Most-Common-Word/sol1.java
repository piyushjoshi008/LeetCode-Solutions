// ==========================================================
// 819. Most Common Word
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 29 ms (Beats 5%)
// Memory     : 44.6 MB (Beats 50%)
// Link       : https://leetcode.com/problems/most-common-word/
// ==========================================================

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");
        String[] arr = paragraph.trim().split("\\s+");
        Map<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(String ban : banned){
            set.add(ban.toLowerCase());
        }
        int max = 0;
        String key = "";
        for(String word : arr){
            if(!set.contains(word)){
                map.put(word, map.getOrDefault(word,0) + 1);
                if(map.get(word) > max){ max = map.get(word); key = word; }
            }
        }


        return key;

    }
}