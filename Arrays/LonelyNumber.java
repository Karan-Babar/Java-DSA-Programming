package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//2150. Find All Lonely Numbers in the Array
public class LonelyNumber {
    
    public static List<Integer> findLonely(int[] nums) {

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == 1 && !freqMap.containsKey(num - 1) && !freqMap.containsKey(num + 1)) {
                list.add(num);
            }
        }
        
        return list;
    }

    public static void main(String[] args) {
        
        int nums[] = {1,3,5,3};

        System.out.println(findLonely(nums));
    }
}