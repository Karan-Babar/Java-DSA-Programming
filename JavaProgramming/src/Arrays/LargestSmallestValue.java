package Arrays;

public class LargestSmallestValue {

    public static int getlargest(int numbers[]) {
      int largest = Integer.MIN_VALUE;
      int smallest = Integer.MAX_VALUE;

      for (int i = 0; i < numbers.length; i++) {
          if (smallest > numbers[i]) {
              smallest = numbers[i];
          }
          if (largest < numbers[i]) {
              largest = numbers[i];
          }
      }
        System.out.println("largest value is : " + largest);
      return smallest;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};


        System.out.println("smallest: " + getlargest(numbers));
    }
}
