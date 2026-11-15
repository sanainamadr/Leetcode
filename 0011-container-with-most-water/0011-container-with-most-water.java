class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int Mwater =0;
        while(left<right){
            int waterLevel = Math.min(height[left], height[right]);
            Mwater = Math.max(Mwater, waterLevel * (right - left) );
            if(height[left] < height[right])
            left++;
            else{
                right--;
            }
        }

        return Mwater;

    }
}