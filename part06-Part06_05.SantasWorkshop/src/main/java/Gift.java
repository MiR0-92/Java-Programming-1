public class Gift {
    private String name;
    private int weight;

    public Gift (String nameOfGift, int weightOfGift){
        this.name = nameOfGift;
        this.weight = weightOfGift;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String toString(){
        return "Gift: " + name + "(" + weight + " kg)";
    }
}
