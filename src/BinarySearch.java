import java.util.Deque;
import java.util.LinkedList;

public class BinarySearch{
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(34);
        dq.addLast(35);
        dq.add(56);
        System.out.println(dq.removeLast());
        System.out.println(dq.peekLast());
    }
}
