import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        backtrack(0, "", digits, result);
        return result;
    }

    private void backtrack(int index, String current, String digits, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            backtrack(index + 1, current + ch, digits, result);
        }
    }

    
    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber obj = new LetterCombinationsOfPhoneNumber();

        String digits = "23";
        List<String> result = obj.letterCombinations(digits);

        System.out.println("Letter combinations: " + result);
    }
}
