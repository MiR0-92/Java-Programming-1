public class Timer{

    private ClockHand milisecond;
    private ClockHand second;

    public Timer(){
        this.milisecond = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public void advance(){
        this.milisecond.advance();

        if (this.milisecond.value() == 0){
            this.second.advance();
        }
    }

    public String toString(){
        return this.second + ":" + this.milisecond;
    }
}
