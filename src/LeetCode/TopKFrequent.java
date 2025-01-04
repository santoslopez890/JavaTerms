package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        //Hashmap for storing values
        HashMap<Integer,Integer> count=new HashMap<>();
        //making a list array that's size of the array for the amount of times a number shows up
        List<Integer>[] freq = new List[nums.length + 1];
        //
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();

        }
        //putting the numbers in the hashmap
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        // for each entry in count
        //add the value of the times that it appears to the array of lists
        for (Map.Entry<Integer, Integer> entry : count.entrySet())
        {
            freq[entry.getValue()].add(entry.getKey());
        }
        //we are making a result array of size k to hold the answer
        int[] res = new int[k];
        int index = 0;
        //looping back through the array
        //while i is less than 0, and the index is less than k
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            //for each integer in the list at index i
            for (int n : freq[i]) {
                //we put the
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;

    }
}
