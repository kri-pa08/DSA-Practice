//Rmove K digits Leetcode
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        
        char[] stack = new char[num.length()];
        int top = -1;
        
        for (int i = 0; i < num.length(); i++) {
            while (top >= 0 && k > 0 && stack[top] > num.charAt(i)) {
                top--;
                k--;
            }
            stack[++top] = num.charAt(i);
        }
        
        while (k > 0) {
            top--;
            k--;
        }
        
        int start = 0;
        while (start <= top && stack[start] == '0') start++;
        
        if (start > top) return "0";
        return new String(stack, start, top - start + 1);
    }
    
    public static void main(String[] args) {
        RemoveKDigits sol = new RemoveKDigits();
        System.out.println(sol.removeKdigits("1432219", 3)); 
        System.out.println(sol.removeKdigits("10200", 1)); 
        System.out.println(sol.removeKdigits("10", 2)); 
    }
}
