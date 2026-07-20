class Solution {
    public int compress(char[] chars) {
        StringBuilder str=new StringBuilder();
        StringBuilder result=new StringBuilder();
        int count=1;
        for(char c:chars){
            str.append(c);
        }
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                result.append(str.charAt(i));
                if(count>1){
                    result.append(count);
                }
                count=1;
            }
        }
        for(int i=0;i<result.length();i++){
            chars[i]=result.charAt(i);
        }
        return result.length();
        
    }
}