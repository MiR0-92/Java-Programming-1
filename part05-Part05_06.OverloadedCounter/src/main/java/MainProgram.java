
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter counter = new Counter();

        System.out.println(counter);

        counter.increase();
        System.out.println(counter.value());
        counter.increase(5);
        System.out.println(counter.toString());
        counter.increase(-10);
        System.out.println(counter.toString());
        counter.decrease(5);
        System.out.println(counter.toString());
        counter.decrease(-10);
        //System.out.println(counter.value());

        Counter newCounter = new Counter(10);
        
        newCounter.decrease(-5);
        System.out.println(newCounter);
    }
}
