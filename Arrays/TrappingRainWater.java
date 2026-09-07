public class TrappingRainWater {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {

            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }

    // Test locally in VS Code
    public static void main(String[] args) {
        TrappingRainWater sol = new TrappingRainWater();

        int[] arr1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(sol.trap(arr1));  // Output: 6

        int[] arr2 = {4,2,0,3,2,5};
        System.out.println(sol.trap(arr2));  // Output: 9
    }
}
