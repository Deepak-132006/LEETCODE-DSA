package HashMap;


import java.util.*;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(11);
        pq.add(12);
        pq.add(13);

        
        System.out.println(pq); // order inside may look random
        System.out.println(pq.peek()); // smallest element 
        System.out.println(pq.poll()); // removes and returns smallest 
        System.out.println(pq.peek()); // next smallest 
    }    
}
