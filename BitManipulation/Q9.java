package BitManipulation;

public class Q9 {
    
    //Convert all uppercase letters to lowercase using bit manipulation.
      public static void main(String[] args) {

        String str = "HeLLo WoRLd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check if uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch | 32);
            }

            result += ch;
        }

        System.out.println("Original : " + str);
        System.out.println("Lowercase: " + result);
    }
}
