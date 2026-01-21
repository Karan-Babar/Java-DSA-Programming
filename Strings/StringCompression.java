package Strings;

public class StringCompression {
    
    //Input: chars = ["a","a","b","b","c","c","c"]
    //Output: Return 6, ->"a2b2c3"
    public static int compress(char[] chars) {
        int write = 0; 
        int read = 0;    

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};

        System.out.println(compress(chars));
    }
}
