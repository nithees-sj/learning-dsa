
import java.util.HashMap;

public class HighestOccuring{
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,4};

        //To find this need to find their frequemcy and check soo on and return the maximum frequency element 

        HashMap<Integer,Integer> map = new HashMap<>();
        int maxf = 0;
        int maxe = 0;
        for(int num : arr){
            int freq = (map.getOrDefault(num, 0)+1);
            map.put(num,freq);

            if(freq>maxf){
                maxf = freq;
                maxe = num;
            }
        }
        System.out.println(maxe + " " + maxf);
    }
}