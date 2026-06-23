
import java.util.Arrays;

public class SquareAnsSort{
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};

        int n = nums.length;
        int left=0;
        int right = n-1;
        int index = n-1;

        int res[] = new int[n];

        while(left<=right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare > rightSquare){
                res[index] = leftSquare;
                left++;
            }
            else{
                res[index] = rightSquare;
                right--;
            }
            index--;
        }
        System.out.println(Arrays.toString(res));
    }
}