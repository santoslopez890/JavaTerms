package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubsetofAnagrans {
    public List<List<String>> groupAnagrams(String[] strs) {
        //we have to group the items in the array by how many characters they have from a-z
        HashMap<String,List<String>> result=new HashMap<>();
        //we put these items into a hashmap witht the same characters
        for (String s :strs){
            int[] count = new int[26];
            for (char c:s.toCharArray()){
                //casting to int int ascii = (int) character;
            count[c-'a'] ++;
            }
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
