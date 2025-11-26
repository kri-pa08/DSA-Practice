class Solution {
    public int minimumPairRemoval(int[] nums) {
        int[] freq = new int[100001];
        for (int n : nums) freq[n]++;
        
        int ops = 0;
        for (int f : freq) {
            if (f == 1) return -1;
            ops += f / 2;
        }
        return ops;
    }
}
//leetcode 3507