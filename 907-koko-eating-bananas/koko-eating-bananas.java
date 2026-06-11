class Solution {
    
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i : piles){
            max = Math.max(i,max);
        }

        int low = 1;
        int high = max;
        int mid = 0;
        int ans=0;
        while(low <= high){
            mid = (low + high)/2;
            int hr = 0;

            for(int i=0;i<piles.length;i++){
                hr += Math.ceil((piles[i]*1.0)/mid);
            }

            if(hr<=h){
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;   
    }
}