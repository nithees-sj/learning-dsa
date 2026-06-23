// This problem has 3 types of soliutions:

//         1.Sum formula method :
//                 Formula : n*(n+1)/2; 
//                 And then sum of array -formula answer
//         2.Using XOR Function
//         3.Hashing this has o(n^2) as time complexity


public class MissingNumber{
    public static void main(String[] args) {
        int arr[] = {0,1,2,4};

        int n = arr.length;

        int formula = n*(n+1)/2;

        int sum = 0;

        for(int num : arr){
            sum+=num;
        }
        
        System.out.println(formula-sum);
    }
}