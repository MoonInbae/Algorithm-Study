import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        List<String> list = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));
        List<String> all = new ArrayList<>(list);
        for(int i=0; i<list.size(); i++) {
            for(int j=0; j<list.size(); j++) {
                if(i == j) continue;
                all.add(list.get(i)+list.get(j));
            }
        }
        for(int i=0; i<list.size(); i++) {
            for(int j=0; j<list.size(); j++) {
                for(int k=0; k<list.size(); k++) {
                    if(i == j || i == k || j == k) continue;
                    all.add(list.get(i)+list.get(j)+list.get(k));
                }
            }
        }
        for(int i=0; i<list.size(); i++) {
            for(int j=0; j<list.size(); j++) {
                for(int k=0; k<list.size(); k++) {
                    for(int l=0; l<list.size(); l++) {
                        if(i == j || i == k || i == l || j == k || j == l) continue;
                        all.add(list.get(i)+list.get(j)+list.get(k)+list.get(l));
                    }
                }
            }
        }
        for(String s : babbling)
            if(all.contains(s)) cnt++;
        return cnt;
    }
}