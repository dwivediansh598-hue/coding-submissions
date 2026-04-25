class Solution {
    public int maxArea(int[] heights) {
       
        int n=heights.length;
        int i=0;int r=n-1;int ans=0;
        while(i<r){
            int h=Math.min(heights[i],heights[r]);
            int width=r-i;
            int water=h*width;
            if(water>ans){
                ans=water;
                
            }
            if(heights[i]<heights[r]){
                i++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}

   