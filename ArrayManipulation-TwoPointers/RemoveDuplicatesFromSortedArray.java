public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
        // Input: nums = [1,1,1,2,2,3]
        // Output: 5, nums = [1,1,2,2,3,_]
        // Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 
        // and 3 respectively.
        // It does not matter what you leave beyond the returned k (hence they are underscores).
        int nums[] = {1,1,1,2,2,3};
        int i=0;
        int count=0;
        for(int num:nums){
            if(count<2 || num!=nums[count-2]){
                nums[count] = num;
                count++;
            }
        }
        System.out.println(count);
    }
}