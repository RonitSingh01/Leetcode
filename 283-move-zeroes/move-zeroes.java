class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j=n-1;
        int count=0;
        int s =0;
       for(int i=0;i<n;i++){
        if(nums[i]==0){
            count++;
        }
    
        else{
            if(count>0){
                int temp = nums[s];
                nums[s]=nums[i];
                nums[i] = temp;
            }
            s++;
        }
            
        }
            
       } 
    }
