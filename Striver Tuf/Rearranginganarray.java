import java.util.*;
public class Rearranginganarray{
    public static void main(String[] args) {
        //In this probelm the question is like to rearrange the array elements one by one by using the sign like 
        //Example : [1,-3,5,-2,1]

        int nums[] = {3,1,-2,-5,2,-4};
        int ans[] = new int[nums.length];

        int posIndex = 0;
        int negIndex = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[posIndex] = nums[i];
                posIndex +=2;
            }
            else if(nums[i]<0){
                ans[negIndex] = nums[i];
                negIndex +=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}