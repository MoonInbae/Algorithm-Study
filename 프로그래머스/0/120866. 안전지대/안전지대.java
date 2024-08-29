class Solution {
    private int[][] arr;
    private int safe;
    public int solution(int[][] board) {
        this.arr = board;
        this.safe = arr.length * arr[0].length;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 1) {
                    safe--;
                    if(i-1>=0 && j-1>=0 && arr[i-1][j-1] == 0) 
                        changeToDangerous(i-1, j-1);
                    if(i-1>=0 && arr[i-1][j] == 0) 
                        changeToDangerous(i-1, j);
                    if(i-1>=0 && j+1<arr[i].length && arr[i-1][j+1] == 0) 
                        changeToDangerous(i-1, j+1);
                    if(j-1>=0 && arr[i][j-1] == 0) 
                        changeToDangerous(i, j-1);
                    if(j+1<arr[i].length && arr[i][j+1] == 0) 
                        changeToDangerous(i, j+1);
                    if(i+1<arr.length && j-1>=0 && arr[i+1][j-1] == 0) 
                        changeToDangerous(i+1, j-1);
                    if(i+1<arr.length && arr[i+1][j] == 0) 
                        changeToDangerous(i+1, j);
                    if(i+1<arr.length && j+1<arr[i].length && arr[i+1][j+1] == 0) 
                        changeToDangerous(i+1, j+1);
                }
            }
        }
        return safe;
    }
    private void changeToDangerous(int i, int j) {
        this.arr[i][j] = -1;
        this.safe--;
    }
}