import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};

        // Three pointer approach
        // low  -> boundary for 0
        // mid  -> current element
        // high -> boundary for 2

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 1) {
                mid++;
            }

            else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }

            else { // nums[mid] == 0
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}