package Arrays;

public class LinearSearch {

    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
          }
        return -1;
        }
        public static void main (String[] args){
            int[] numbers = {2, 4, 6, 8, 10, 12, 14};
            int key = 14;

            int index = LinearSearch(numbers, key);
            if(index == -1) {
                System.out.println("Element not found");
            }else{
                System.out.println("Element found at index " + index);
            }
        }
    }
