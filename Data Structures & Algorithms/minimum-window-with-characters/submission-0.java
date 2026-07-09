class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)]++;
        }
        int l=0,r=0,strInd=-1,minLen=Integer.MAX_VALUE,cnt=0;
        while(r<s.length()){
            if(hash[s.charAt(r)] > 0) cnt++; 
            hash[s.charAt(r)]--;
            while(cnt == t.length()){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    strInd = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0 ) cnt--;
                l++;
            }
            r++;
        }
        return strInd == -1 ? "" : s.substring(strInd,strInd+minLen);
    }
}
