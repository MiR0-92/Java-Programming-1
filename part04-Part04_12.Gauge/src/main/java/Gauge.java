public class Gauge {
    private int value;

    public Gauge() {
        
    }

    public void increase() {
        if (value < 5) {
            value++;
        } else {
            value = 5;
        }
    }

    public void decrease() {
        if (value > 0) {
            value--;
        } else {
            value = 0;
        }
    }

    public int value(){
        return value;
    }

    public boolean full(){
        return value == 5;
    }

}
