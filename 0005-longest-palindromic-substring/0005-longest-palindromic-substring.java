class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            int l=i;
            int r=i;
            
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            String temp=s.substring(l+1,r);
            if(temp.length()>ans.length()){
                ans=temp;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;

            }
            temp=s.substring(l+1,r);
            if(temp.length()>ans.length()){
                ans=temp;
            }
        }
        return ans;
        
    }
}