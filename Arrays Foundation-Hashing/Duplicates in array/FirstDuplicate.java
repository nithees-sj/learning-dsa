import java.util.HashSet;

public class FirstDuplicate{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6};

        //For this problem we need to doo the same for the duplicated elements in an array
        //Like adding them in HashSet and printing the element which 
        //satisfiying the condition by not adding the element in the set 
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                System.out.println(num);
                break;
            }
        }
    }
}