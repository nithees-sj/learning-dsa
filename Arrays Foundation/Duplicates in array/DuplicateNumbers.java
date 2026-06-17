
import java.util.HashSet;

public class DuplicateNumbers{
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,6,7,7,8};

        //To perform this we are going to add a the array elements in 
        //HashSet and very if it add or not and print it

        HashSet<Integer>set = new HashSet<>();

        for(int num:arr){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }
}