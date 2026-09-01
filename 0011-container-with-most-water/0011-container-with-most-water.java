class Solution {
    public int maxArea(int[] height) {
        int mw=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int w=r-l;
            int h=Math.min(height[l],height[r]);
            int area=w*h;
            mw=Math.max(area,mw);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return mw;
    }
}