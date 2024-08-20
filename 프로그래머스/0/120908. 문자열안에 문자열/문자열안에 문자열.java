class Solution {
    public int solution(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        for(int i=0; i<=arr1.length-arr2.length; i++) {
            System.out.println("a : "+arr1[i]);
            int k = i;
            for(int j=0; j<arr2.length; j++) {
                System.out.println("b : "+arr2[j]);
                System.out.println("----k : "+arr1[k]);
                if(!arr1[k++].equals(arr2[j])) break;
                if(j==arr2.length-1) return 1;
            }
        }
        return 2;
    }
}