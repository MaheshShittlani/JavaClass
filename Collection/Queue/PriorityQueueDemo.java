import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.offer("Jaipur");
        pq.offer("Bikaner");
        pq.offer("Ajmer");
        pq.offer("Udaipur");

        Iterator<String> itr = pq.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        PriorityQueue<Integer> ipq = new PriorityQueue<>();

        ipq.add(101);
        ipq.add(1);
        ipq.add(11);
        ipq.add(21);
        ipq.add(320);

        Iterator<Integer>itr1 = ipq.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println(ipq);
    }
}