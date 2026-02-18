package Questions;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class NthLargestElement {
    static void main(String [] args) {
        List<Integer> nums = List.of(45,46,3,51531,13,34,96,88,31,1,12,31,46);
        int n=9;
        HashSet<Integer> set = new HashSet<>(nums);
        if (set.size()<n){
            System.out.println("Invalid input");
            return;
        }else {
            PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(set);
            for (int i=1;i<=n-1;i++){
                pq.poll();
            }
            System.out.println(pq.size());
        }

    }
}
