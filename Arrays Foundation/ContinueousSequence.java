
import java.util.HashSet;

public class ContinueousSequence{
    public static void main(String[] args) {
        int arr[] = {0,3,7,2,5,8,4,6,0,1};

        HashSet<Integer> set = new HashSet<>();

        for(int nums : arr){
            set.add(nums);
        }

        int long_sequence = 0;
        for(int num : set){

            //Using this condition we are simply gona choose forst element
            if(!set.contains(num-1)){
                int curr = num;
                int count=1;

                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                long_sequence = Math.max(long_sequence,count);
            }
        }
        System.out.println(long_sequence);
    }
}