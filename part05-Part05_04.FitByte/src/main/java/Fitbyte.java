public class Fitbyte {
    private int age;
    private int restHeartRate;

    public Fitbyte(int age, int restHeartRate){
        this.age = age;
        this.restHeartRate = restHeartRate;
    }

    public double maxHeartRate(){
        return 206.3 - (0.711 * this.age);
    }

    public double targetHeartRate(double percentageOfMaximum){
        return ((maxHeartRate() - this.restHeartRate) * (percentageOfMaximum) + this.restHeartRate);
    }

}
