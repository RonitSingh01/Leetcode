class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i = 1; i <= n ; i++){
            if(arr[i-1]>arr[i%n])count++;
        }
        return count<=1 ? true : false;
    }
}