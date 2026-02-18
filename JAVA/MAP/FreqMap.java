package MAP;

import javax.swing.text.Style;
import java.util.HashMap;
import java.util.Map;

public class FreqMap {
    public static void main(String[] args) {
        String str = "TheworldisAstageAndAllthemenandwoenareplayres";
        String str2 = str.toLowerCase();

       Map<Character,Integer> map = new HashMap<>();

       for (int i=0; i<str2.length();i++){
           char ch = str2.charAt(i);
//           if (map.containsKey(ch)){
//               map.put(ch,map.get(ch)+1);
//           }else {
//               map.put(ch,1);
//           }

           map.put(ch,map.getOrDefault(ch,0)+1);
//           map.computeIfAbsent();
       }
        System.out.println(map);
    }
}





















