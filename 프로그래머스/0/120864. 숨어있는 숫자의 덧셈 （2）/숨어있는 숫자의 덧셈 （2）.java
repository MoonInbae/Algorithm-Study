class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        String s = "";
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>='0' && arr[i]<='9') s += arr[i];
            else if(s.length()>0) {
                answer += Integer.parseInt(s);
                s = "";
            }
        }
        if(s.length()>0)
            answer += Integer.parseInt(s);
        return answer;
    }
}