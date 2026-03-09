package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void generate(int n, String current, List<String> result) {
        // base case
        if (current.length() == n) {
            result.add(current);
            return;
        }

        // choose 0
        generate(n, current + "0", result);

        // choose 1
        generate(n, current + "1", result);
    }

    public static void main(String[] args) {

        int n = 3;
        List<String> result = new ArrayList<>();

        generate(n, "", result);

        System.out.println(result);
    }
}
