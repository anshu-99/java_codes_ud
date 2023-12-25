package CollectionList;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
//        add in queue ll
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        queue.offer(16);

        System.out.println(queue);
//        deletion
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
