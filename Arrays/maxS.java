public class maxS {
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum= integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start =i;
            for (int j=i; j<numbers.length;j++){
                 int end =j;
                 currSum=0;
                 for(int k=start; k<=end; k++){
                    currSum+=numbers[k];
                 }
                    System.out.print(currSum);
                    if(maxSum<currSum){
                        maxSum = currSum;
                    }

                 }
    }
    System.out.println("max sum =" +maxSum);
}
}
