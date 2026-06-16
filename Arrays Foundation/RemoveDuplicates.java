
import java.util.LinkedHashSet;

public class RemoveDuplicates{
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5,6,6};

        //for removing the duplicates in the array we should make the array
        //added in the linkedHashSet soo that it will not lose the order of the array
        //if we do so in hashmap the order will be as sorted 

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}