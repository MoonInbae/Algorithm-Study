class Solution {
    public String solution(String polynomial) {
        int xTemp = 0;
        int xNum = 0;
        int temp = 0;
        String[] arr = polynomial.split(" \\+ ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i].charAt(arr[i].length()-1) == 'x') {
                if(arr[i].length()-1 == 0) {
                    xNum += 1;
                    continue;
                }
                xNum += Integer.parseInt(arr[i].substring(0,arr[i].length()-1));
            }
            else temp += Integer.parseInt(arr[i]);
        }
        String answer = "";
        if(xNum > 1) answer += xNum + "x";
        if(xNum == 1) answer += "x";
        if(temp != 0 && !answer.equals("")) answer += " + "+temp;
        if(answer.equals("")) answer += temp;
        return answer;
    }
}