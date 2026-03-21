package BitManipulation;

import java.util.*;

public class InfyTest {
    
    public static int solution(Integer[] a, int[] b, int n){

        StringBuffer s = new StringBuffer();

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);

        //start with 1
        for(int i=0; i<n; i++){
           int one = a[i];
           while (one > 0) {
              s.append(1);
              one--;
           }
           int zero = b[i];
           while (zero > 0) {
              s.append(0);
              zero--;
           }
        }
        //calculate binary string to decimal
        int value1 = 0;
        for(int i=0; i<s.length(); i++){
            int digit = s.charAt(i) - '0';
            
            value1 = value1 * 2 + digit;
        }

        //start with 0
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i<n; i++){
           int zero = b[i];
           while (zero > 0) {
              s2.append(0);
              zero--;
           }
           int one = a[i];
           while (one > 0) {
              s2.append(1);
              one--;
           }
        }

        //calculate binary string to decimal
        int value2 = 0;
        for(int i=0; i<s2.length(); i++){
            int digit = s2.charAt(i) - '0';
            
            value2 = value2 * 2 + digit;
        }

        System.out.println(s);
        System.out.println(s2);
        return Math.max(value1, value2);
    }
    public static void main(String[] args) {

        int n = 3;
        Integer[] a = {3,2,1}; //1's
        int[] b = {1,2,3}; //0's
        
        System.out.println(solution(a, b, n));
    }
}