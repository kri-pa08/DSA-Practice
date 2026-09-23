//Move zeroes to end without breakign the order of non zeroes

public class MoveZeroes {

    public static void moveZeroes(int[] arr) {

        int j = 0;

        // Bring non zeroes in front;;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        //fill spaces with 0;
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}