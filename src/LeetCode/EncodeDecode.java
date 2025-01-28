package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encode(List<String> strs) {
        StringBuilder one=new StringBuilder();
        for (String s:strs){
            one.append(s);
            one.append("???");
        }
        return one.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        StringBuilder one=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='?' && str.charAt(i+1)=='?' && str.charAt(i+2)=='?'){
                result.add(one.toString());
                one=new StringBuilder();
                i+=2;
            }else {
                one.append(str.charAt(i));
            }
        }
        return result;
    }
}
