
import java.util.HashMap;

public class FirstUniqueCharecter{
    public static void main(String[] args) {
        String s = "loveleetcode";

        int res = -1;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,-1);
            }
            else{
                map.put(ch,i);
            }
        }
        for (int i=0; i< s.length();i++) {
            char ch = s.charAt(i);
            if(map.get(ch) != -1){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}