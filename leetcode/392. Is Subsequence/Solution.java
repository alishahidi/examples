class Solution {
    public static void main(String[] args) {
        System.out.println(isSubsequence("ace", "abcde"));
    }


    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        
        if(s.isEmpty()){
            return true;
        }

        for(char c : t.toCharArray()){
            if(s.charAt(i) == c){
                i++;
            }

            if(i >= s.length()){
                break;
            }
        }

        return i >= s.length();
    }
}