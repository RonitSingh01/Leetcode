class Solution {
    public boolean check(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr,arr.length);
        int n = arr.length;
        Arrays.sort(copyArr);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: arr){
            al.add(i);
        }
        ArrayList<Integer> al1 = new ArrayList<>();
        for(int i: copyArr){
            al1.add(i);
        }
        for(int r=0;r<n;r++){
            Collections.rotate(al,1);
            if(al.equals(al1)) return true;

        }
        return false;
    }
}