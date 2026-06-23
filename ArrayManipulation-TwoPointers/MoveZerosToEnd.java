
import java.util.Arrays;

public class MoveZerosToEnd{
    public static void main(String[] args) {
        int arr[] = {1,2,0,3,0,4};

        int i=0;

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i] = arr[j];
                i++;
            }
        }
        while(i<arr.length){
            arr[i]=0;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}