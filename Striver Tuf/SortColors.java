import java.util.*;
public class SortColors{
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};

        //Threee pointer approach 
        //This approach works like the swapping mechanism

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else{
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