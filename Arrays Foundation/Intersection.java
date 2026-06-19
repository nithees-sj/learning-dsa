
import java.util.Arrays;
import java.util.HashSet;

public class Intersection{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};

        int arr2[] = {2,4};

        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>result = new HashSet<>();

        for(int num : arr1){
            set1.add(num);
        }
        for(int num : arr2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];

        int i = 0;
        for (int n : result) {
            ans[i++] = n;
        }

        System.out.println(Arrays.toString(ans));
    }
}