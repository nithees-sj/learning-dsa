public class ContainerWithMaxWater{
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};

        int left = 0;
        int right = nums.length-1;

        int maxArea = 0;

        while(left<=right){
            int width = right-left;

            int currArea = Math.min(nums[left],nums[right])*width;

            maxArea = Math.max(maxArea,currArea);

            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxArea);
    }
}