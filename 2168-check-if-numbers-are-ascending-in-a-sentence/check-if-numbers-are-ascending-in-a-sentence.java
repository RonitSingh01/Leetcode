class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = 0;
        for (String word : s.split(" ")) {
            if (word.matches("\\d+")) {
                int num = Integer.parseInt(word);
                if (num <= prev) return false; 
                prev=num;
            }
        }
        return true;
    }
}