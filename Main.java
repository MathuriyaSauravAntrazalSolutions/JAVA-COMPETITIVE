import java.util.*;
class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split("\s");
        HashMap<Integer, String> hm = new HashMap<>();
        for(String st: arr){
            hm.put(Integer.parseInt(String.valueOf(st.charAt(st.length()-1)))-1, st.substring(0, st.length()-1));
        }
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i<arr.length-1){
            String ss = hm.get(i);
            ss += ' ';
            ans.append(ss);
            i++;
        }
        String ss = hm.get(i);
        ans.append(ss);
        return ans.toString();
    }
}