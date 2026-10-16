import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Apple");
        names.push("Banana");
        names.push("Cherry");
        names.push("Pineapple");
        names.push("Grape");

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }
    }
}
