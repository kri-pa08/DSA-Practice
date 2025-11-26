class Solution {
    public int minimumPairRemoval(int[] nums) {
        java.util.List<Integer> a = new java.util.ArrayList<>();
        for (int n : nums) a.add(n);
        int ops = 0;
        while (hasInversion(a)) {
            int minSum = Integer.MAX_VALUE, idx = -1;
            for (int i = 0; i < a.size() - 1; i++) {
                int s = a.get(i) + a.get(i + 1);
                if (s < minSum) {
                    minSum = s;
                    idx = i;
                }
            }
            a.set(idx, minSum);
            a.remove(idx + 1);
            ops++;
        }
        return ops;
    }

    private boolean hasInversion(java.util.List<Integer> a) {
        for (int i = 0; i < a.size() - 1; i++)
            if (a.get(i) > a.get(i + 1))
                return true;
        return false;
    }
}

//leetcode 3507