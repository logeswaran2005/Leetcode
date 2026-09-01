class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int right=s.length()-1;
        int count=0;
        for(int i=right;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
}