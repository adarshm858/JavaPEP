package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        int[] nums={56,45,878,5,6};

        // All the colleection accept only Object type;
        ArrayList list = new ArrayList();
        list.add(56);
        list.add("hey");
        list.add(8.2);
        list.add(true);
        System.out.println(list);

        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(56);
        listOfNums.add(45);
        listOfNums.add(878);
        listOfNums.add(5);
//        listOfNums.add(5.6);
        System.out.println(listOfNums);

        listOfNums.remove(2);
        System.out.println(listOfNums);
        listOfNums.add(null);
        System.out.println(listOfNums);
        listOfNums.set(2,69);
        System.out.println(listOfNums);
        listOfNums.add(2,699);
        System.out.println(listOfNums);
// For i
    for(int i=0;i<listOfNums.size();i++){
        System.out.print(listOfNums.get(i)+ " ");
    }
        System.out.println();
    // For each

    for (Integer num : listOfNums){
//        listOfNums.add(11);  // collection can;t modiying during iration
        System.out.println(num + " ");
    }

    // Using Iterator
        Iterator<Integer> iterator = listOfNums.iterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next()+ " ");
    }

    //  todo reseach on  looping from last to first in lsitOfNums

        listOfNums.removeLast();
        listOfNums.stream().filter(x-> x%2==0).forEach(System.out::println);

        if (listOfNums.isEmpty()){
            System.out.println("Empty");
        }
        System.out.println("First and last");
        System.out.println(listOfNums.get(0));
        System.out.println(listOfNums.get(listOfNums.size()-1));

        System.out.println(listOfNums.getFirst());
        System.out.println(listOfNums.getLast());

        List<Integer> list2 = List.of(54 ,65,4,435);
        listOfNums.addAll(list2);                   //Todo see how you truly marge two lists
        System.out.println(listOfNums);
        listOfNums.clear();
}
}