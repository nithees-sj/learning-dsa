public class Anagram{
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "naagrrr";

        boolean res = true;

        if(s1.length() != s2.length()){
            res = false;
        }

        int[] freq = new int[26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for (int i=0;i<26;i++) {
            if(freq[i] != 0){
                res = false;
            }
        }
        System.out.println(res);
    }
}