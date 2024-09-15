class Solution {
    public String solution(String[] id_pw, String[][] db) {
        boolean status = false;
        for(String[] temp : db) {
            if(id_pw[0].equals(temp[0])) {
                if(id_pw[1].equals(temp[1])) status = true;
                else return "wrong pw";
            }
            if(status) return "login";
        }
        return "fail";
    }
}