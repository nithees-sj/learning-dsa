public class TwoSumII{
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 26;

        int n = nums.length;

        int left=0;
        int right = n-1;
        
        while(left<right){
            if(nums[left]+nums[right] == target){
                System.out.println(left+" , "+right);
                break;
            }
            else if(nums[left]+nums[right]<target){
                left++;
            }
            else if (nums[left]+nums[right]>target) {
                right--;
            }
        }
    }
}