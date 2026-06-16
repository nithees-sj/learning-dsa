import java.util.HashSet;

public class FindDuplicates{
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5,5};

        HashSet <Integer> set = new HashSet<>();

        for(int num:arr){
            if(!set.add(num)){
                System.out.print(num + " ");
            }
        }
    }
}