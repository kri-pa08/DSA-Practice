import java.util.*;
//Remove Invalid Paranthesis
public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        remove(s, result, 0, 0);
        return result;
    }
    
    private void remove(String s, List<String> result, int lastRemove, int lastValid) {
        int removeCount = 0, validCount = 0;
        
        for (int i = lastValid; i < s.length(); i++) {
            if (s.charAt(i) == ')') removeCount++;
            else if (s.charAt(i) == '(') validCount++;
            
            if (removeCount > validCount) {
                for (int j = lastRemove; j <= i; j++) {
                    if (s.charAt(j) == ')' && (j == lastRemove || s.charAt(j - 1) != ')')) {
                        remove(s.substring(0, j) + s.substring(j + 1), result, j, i);
                    }
                }
                return;
            }
        }
        
        String reversed = reverseInvert(s);
        if (s.equals(reversed)) {
            result.add(s);
            return;
        }
        
        remove(reversed, result, 0, 0);
    }
    
    private String reverseInvert(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c == '(' ? ')' : c == ')' ? '(' : c);
        }
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        RemoveInvalidParentheses sol = new RemoveInvalidParentheses();
        System.out.println(sol.removeInvalidParentheses("()())()")); 
        System.out.println(sol.removeInvalidParentheses("(a)())()")); 
        System.out.println(sol.removeInvalidParentheses(")(")); 
    }
}
