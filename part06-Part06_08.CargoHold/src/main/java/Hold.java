import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int weight;

    public Hold(int maximumWeight){
        this.weight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){

        if(suitcase.totalWeight() > this.weight){
            return;
        }
        this.suitcases.add(suitcase);
        this.weight -= suitcase.totalWeight();
    }

    public String toString(){

        if (suitcases.isEmpty()){
            return "Zero suitcases added (0kg)";
        }
        int totalCases = 0;
        int totalWeight = 0;

        for (Suitcase suitcase : suitcases){
            totalCases += 1;
            totalWeight += suitcase.totalWeight();
        }
        return totalCases + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems(){
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
}
