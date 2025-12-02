import java.util.*;

public class RemoveInvalidParentheses {

    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        remove(s, result, 0, 0, new char[]{'(', ')'});
        return result;
    }

    private void remove(String s, List<String> result, int lastRemove, int lastScan, char[] par) {
        int count = 0;
        for (int i = lastScan; i < s.length(); i++) {
            if (s.charAt(i) == par[0]) count++;
            if (s.charAt(i) == par[1]) count--;
            
            if (count < 0) {
                for (int j = lastRemove; j <= i; j++) {
                    if (s.charAt(j) == par[1] && (j == lastRemove || s.charAt(j - 1) != par[1])) {
                        remove(s.substring(0, j) + s.substring(j + 1), result, j, i, par);
                    }
                }
                return;
            }
        }

        String reversed = new StringBuilder(s).reverse().toString();
        if (par[0] == '(') {
            remove(reversed, result, 0, 0, new char[]{')', '('});
        } else {
            result.add(reversed);
        }
    }

    public static void main(String[] args) {
        RemoveInvalidParentheses obj = new RemoveInvalidParentheses();
        System.out.println(obj.removeInvalidParentheses("()())()"));   // ["()()()", "(())()"]
        System.out.println(obj.removeInvalidParentheses("(a)())()"));  // ["(a)()()", "(a())()"]
        System.out.println(obj.removeInvalidParentheses(")("));        // [""]
    }
}
