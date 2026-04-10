
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack stack = new Stack();

        System.out.println(stack.isEmpty());
        System.out.println(stack.values());
        stack.add("Value");
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");
        stack.add("5");
        System.out.println(stack.values());
        stack.take();
        System.out.println(stack.values());
        while (!stack.isEmpty()) {
            stack.take();
            System.out.println(stack.values());
        }
        
    }
}
