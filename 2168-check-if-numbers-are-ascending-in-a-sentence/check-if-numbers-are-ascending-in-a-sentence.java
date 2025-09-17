class Solution {
    public boolean areNumbersAscending(String s) {
        int n = s.length();
        String[] arr = s.split(" ");
        ArrayList<Integer> al= new ArrayList<>();
        for(String i: arr){
            if(i.matches("\\d+")){
                al.add(Integer.parseInt(i));
            }
        }
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>=al.get(i+1)) return false;
        }
        return true;
    }
}