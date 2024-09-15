import java.util.*;

class Solution {
    public int solution(String before, String after) {
        List<String> afterList = new ArrayList<String>(Arrays.asList(after.split("")));
        for(String s : before.split("")) {
            if(afterList.contains(s)) afterList.remove(afterList.indexOf(s));
            else return 0;
        }
        return 1;
    }
}