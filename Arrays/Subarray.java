package Arrays;

public class Subarray {
    public static void printSubarray(int numbers[]){
         int ts = 0;
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;

          for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                 int sum =  0;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k];
                }
                System.out.print(" | Sum = " + sum);
                System.out.println( );

                if(sum > max){
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
                  ts++;
            }
            System.out.println( );
          }
          System.out.println("total subarray =" + ts);
          System.out.println("Maximum subarray sum = " + max);
          System.out.println("Minimum subarray sum = " + min);
    }
    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};   
        printSubarray(numbers); 
    }

}
