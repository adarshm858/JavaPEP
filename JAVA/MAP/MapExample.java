package MAP;

import java.util.*;

public class MapExample {
    static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(234,"Amit");
        map.put(897,"akku");
        map.put(456,"aman");
        map.put(656,"Abit");
        map.put(907,"Anmol");

        map.put(673,"Abhay");
        map.put(673,"priya");

        System.out.println(map);
        Set<Integer> keys =map.keySet();
        Collection<String> values = map.values();
        System.out.println(values);

        map.remove(10);
        map.remove(2);
        System.out.println(map);

        System.out.println(map.get(0));
        System.out.println(map.get(1));

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> entry :entries){
            System.out.println(entry.getKey()+ " " + entry.getValue());
//            System.out.println(entry);
        }


    }
}
