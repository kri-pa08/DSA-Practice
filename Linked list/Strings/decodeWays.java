class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.charAt(0) == '0') return 0;

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; 
        dp[1] = 1; 

        for (int i = 2; i <= n; i++) {
            int one = Integer.parseInt(s.substring(i - 1, i));     // last digit
            int two = Integer.parseInt(s.substring(i - 2, i));     // last 2 digits

            // Single digit decode (1–9)
            if (one >= 1 && one <= 9) dp[i] += dp[i - 1];

            // Two digit decode (10–26)
            if (two >= 10 && two <= 26) dp[i] += dp[i - 2];
        }

        return dp[n];
    }
}
