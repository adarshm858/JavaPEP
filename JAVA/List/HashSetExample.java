package List;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetExample {
     public static void main(String ... args) {
         List<Integer> nums = List.of(55 , 42,2,6,8,56,3,8,675);
         ArrayList<Integer> list= new ArrayList<>();

         for (int num : nums){
             if (!list.contains(num)){
                 list.add(num);
             }
         }
         System.out.println(list);
         HashSet<Integer> set = new HashSet<>();
         for (int num : nums){
             set.add(num);
         }

         System.out.println(set);
//         set.add(null);
//         set.add(null)


         for (Integer num : set){
             System.out.println(set);
         }


          Set<Integer> collects=list.stream().collect(Collectors.toSet());
//         list.parallelStream().forEach(System.out::println);


         System.out.println(set.contains(5)); // almost O(1)


       //  Collections.sort(set);

         TreeSet<Integer> treeSet = new TreeSet<>(set);
         System.out.println(treeSet);


         LinkedHashSet<Integer> orderset =new LinkedHashSet<>(set);
         System.out.println(orderset);
    }
}
