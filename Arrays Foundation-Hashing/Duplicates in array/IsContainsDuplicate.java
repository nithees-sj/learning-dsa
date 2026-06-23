
import java.util.HashSet;

public class IsContainsDuplicate{
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};

        //To do this we need to add them in HashSet and update the boolean value

        boolean duplicate = false;

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
                duplicate = true;
            }
        }
        System.out.println(duplicate);
    }
}