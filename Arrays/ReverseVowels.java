public class ReverseVowels {

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        ReverseVowels sol = new ReverseVowels();
        System.out.println(sol.reverseVowels("hello")); // ➝ holle
        System.out.println(sol.reverseVowels("leetcode")); // ➝ leotcede
    }
}
