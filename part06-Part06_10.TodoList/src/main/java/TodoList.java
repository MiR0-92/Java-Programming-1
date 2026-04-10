import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        for (int task = 0; task < list.size(); task++) {
            System.out.println(task + 1 + ": " + list.get(task));
        }
    }

    public void remove(int number) {
        try {
            list.remove(number - 1);
        } catch (Exception e) {
            System.out.println("List is empty or you've inserted wrong number!");
        }
    }
}
