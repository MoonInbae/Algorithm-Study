import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length()%n>0 ? my_str.length()/n+1 : my_str.length()/n;
        String[] arr = new String[size];
        int i=0;
        for(i=0; i<size-1; i++) {
            arr[i] = my_str.substring(i*n, i*n+n);
        }
        arr[i] = my_str.substring(i*n);
        return arr;
    }
}