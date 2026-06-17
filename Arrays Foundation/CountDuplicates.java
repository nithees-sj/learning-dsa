
import java.util.HashMap;

public class CountDuplicates{
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,5,6};

        //This program is to print the value which has duplicates and print them 
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        for(int num : map.keySet()){
            if(map.get(num)>1){
                System.out.println(num + "->" + map.get(num));
            }
        }
    }
}