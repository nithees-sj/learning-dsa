
import java.util.HashMap;

public class FrequencyOfArray{
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,5};
        
        //Initilise a hashMap to store the frequency in the formate of {1=2,2=1....}
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }
        System.out.println(freq);
    }
}