package CollectionList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPq=new PriorityQueue<>();
        PriorityQueue<Integer> maxPq=new PriorityQueue<>(Comparator.reverseOrder());
        minPq.offer(12);
        minPq.offer(20);
        minPq.offer(32);
        minPq.offer(92);
        minPq.offer(72);
        System.out.println("Min Heap: "+minPq);

        maxPq.offer(102);
        maxPq.offer(122);
        maxPq.offer(132);
        maxPq.offer(112);
        maxPq.offer(120);
        System.out.println("Max Heap: "+maxPq);
    }
}
