class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = -1,b=-1;
        int i,j;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target) {
            a=i;
            break;
        }
    }
        for(j=i+1;j<nums.length;j++){
            if(nums[j]==target) b=j;
        }
        if(b==-1) b=a;

        int[] arr = {a,b};
        return arr;
    }
}