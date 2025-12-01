
public class ShortestPalindrome {

    // LeetCode-style method signature
    public String shortestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s;

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev; 

        int n = combined.length();
        int[] lps = new int[n]; 

      
        for (int i = 1; i < n; i++) {
            int len = lps[i - 1];
            while (len > 0 && combined.charAt(i) != combined.charAt(len)) {
                len = lps[len - 1];
            }
            if (combined.charAt(i) == combined.charAt(len)) {
                len++;
            }
            lps[i] = len;
        }

        int longestPalPrefix = lps[n - 1]; 
        String suffixToAdd = s.substring(longestPalPrefix);
        String prefix = new StringBuilder(suffixToAdd).reverse().toString();

        return prefix + s;
    }

   
    public static void main(String[] args) {
        ShortestPalindrome solver = new ShortestPalindrome();

        String s1 = "aacecaaa";
        String s2 = "abcd";
        String s3 = "";
        String s4 = "aaab";

        System.out.println("Input: " + s1 + " -> " + solver.shortestPalindrome(s1)); // aaacecaaa
        System.out.println("Input: " + s2 + " -> " + solver.shortestPalindrome(s2)); // dcbabcd
        System.out.println("Input: \"" + s3 + "\" -> \"" + solver.shortestPalindrome(s3) + "\"");
        System.out.println("Input: " + s4 + " -> " + solver.shortestPalindrome(s4));
    }
}

