import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExample {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();

        names.offer("Apple");
        names.offer("Banana");
        names.offer("Cherry");
        names.offer("Pineapple");
        names.offer("Grape");

        while (!names.isEmpty()) {
            System.out.println(names.poll());
        }
    }
}
