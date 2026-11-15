class Solution {
    public int maxArea(int[] height) {
        // int n =height.length;

        // int[] leftM = new int[n];
        // leftM[0] = height[0];
        // for(int i=1; i<n; i++){
        //     leftM[i] = Math.max(height[i], leftM[i-1]);
        // }

        // int[] rightM = new int[n];
        // rightM[n-1] = height[n-1];
        // for(int i=n-2; i>=0; i++){
        //     rightM[i] = Math.max(height[i], rightM[i+1]);
        // }
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