public class ReverseVowelOfAString{
    public static Boolean isVowel(char a){
        return a == 'a' || a == 'e' || a == 'i' || a== 'o' ||
        a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' ||
        a == 'U';
    }
    public static void main(String[] args) {
        
        // Input: s = "IceCreAm"
        // Output: "AceCreIm"
        // Explanation:
        //     The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
        String s = "IceCreAm";

        int left = 0;
        int right = s.length()-1;


        char arr[] = s.toCharArray();

        while(left<right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(arr));
    }
}