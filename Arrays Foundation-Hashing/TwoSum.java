
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int nums[] = {5,7,3,9,4};
        int target = 16;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compliment = target-nums[i];

            if(map.containsKey(compliment)){
                System.out.println("["+map.get(compliment)+" , "+i+"]");
            }
            map.put(nums[i],i);
        }

    }
}