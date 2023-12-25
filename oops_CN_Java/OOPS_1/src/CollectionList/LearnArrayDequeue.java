package CollectionList;

import java.util.ArrayDeque;

public class LearnArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrDeq=new ArrayDeque<>();
//        ArrayDeque<Integer> arrDeq1=new ArrayDeque<>();
//        ArrayDeque<Integer> arrDeq2=new ArrayDeque<>();
        arrDeq.offer(12);
        arrDeq.offerFirst(14);
        arrDeq.offerFirst(15);
        arrDeq.offerLast(16);
        arrDeq.offer(17);
        System.out.println(arrDeq);

        System.out.println(arrDeq.peekFirst());
        System.out.println(arrDeq.peekLast());
        System.out.println(arrDeq.pollFirst());
        System.out.println(arrDeq.pollLast());
        System.out.println(arrDeq);

    }
}
