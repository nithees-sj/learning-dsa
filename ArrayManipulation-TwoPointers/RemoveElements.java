
import java.util.Arrays;

public class RemoveElements{
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        //The value to delete the element
        int value = 0;

        int i=0;

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=value){
                nums[i]=nums[j];
                i++;
            }
        }

        System.out.println(i + Arrays.toString(nums));
    }
}