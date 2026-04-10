import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int weight;

    public Suitcase(int maximumWeight) {
        this.weight = maximumWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addItem(Item item) {

        if (item.getWeight() > this.weight) {
            return;
        }
        this.suitcase.add(item);
        this.weight -= item.getWeight();
    }

    public String toString() {
        if (this.suitcase.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (suitcase.size() == 1){
            return this.suitcase.size() + " item (" + this.totalWeight() + " kg)";
        }

        return this.suitcase.size() + " items (" + this.totalWeight() + " kg)";
    }

    public int totalWeight(){

        int totalWeight = 0;
        for(Item item : suitcase){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void printItems(){

        for (Item item : suitcase){
            System.out.println(item.getName() + " ("  + item.getWeight() + " kg)");
        }
    }

    public Item heaviestItem(){

        if (suitcase.isEmpty()){
            return null;
        }
        Item heaviest = suitcase.get(0);

        for (Item item : suitcase){
            if (heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}
