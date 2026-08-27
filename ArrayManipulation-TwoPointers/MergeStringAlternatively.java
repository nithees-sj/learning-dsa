public class MergeStringAlternatively{
    public static void main(String[] args) {
        
        // Input: word1 = "abc", word2 = "pqr"
        // Output: "apbqcr"
        // Explanation: The merged string will be merged as so:
        // word1:  a   b   c
        // word2:    p   q   r
        // merged: a p b q c r

        String a = "abc";
        String b = "pqr";

        int pointer1 = 0;
        int pointer2 = 0;

        StringBuilder ans = new StringBuilder();
        while(pointer1<a.length() || pointer2<b.length()){
            if(pointer1<a.length()){
                ans.append(a.charAt(pointer1));
                pointer1++;
            }
            if(pointer2<b.length()){
                ans.append(b.charAt(pointer2));
                pointer2++;
            }
        }
        System.out.println(ans.toString());
    }
}