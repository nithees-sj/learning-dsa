
import java.util.HashMap;

public class UniqueElements{
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5,5,6};

        //For this add the same usual way but we should insert the which freq == 1 in the map

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        for(int key : arr){
            if(map.get(key)==1){
                System.out.print(key);
            }
        }
    }
}