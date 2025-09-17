class Solution {
    static void reverse(int[] arr,int left,int right,int k,int n){
        if(left>right) return;
        while(left<=right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1,k,n);
        reverse(nums,0,k-1,k,n);
        reverse(nums,k,n-1,k,n);
    }
}