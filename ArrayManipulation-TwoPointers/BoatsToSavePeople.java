import java.util.*;
public class BoatsToSavePeople{
    public static void main(String[] args) {

        // Input: people = [3,2,2,1], limit = 3
        // Output: 3
        // Explanation: 3 boats (1, 2), (2) and (3)

        int people[] = {3,2,2,1};
        int limit = 3;
        int boat = 0;
        int left=0;
        int right=people.length-1;
        Arrays.sort(people);

        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boat++;
        }
        System.out.println(boat);
    }
}