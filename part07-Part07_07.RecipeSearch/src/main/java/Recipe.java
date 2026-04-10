import java.net.Socket;
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, String ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
        this.ingredients.add(ingredients);
    }

    public String getName(){
        return this.name;
    }

    public int getCookingTime(){
        return this.cookingTime;
    }

    public String getIngredients(){
        String ingredients = "";
        for (String string : this.ingredients) {
            ingredients = ingredients + string + " ";
        }
        return ingredients;
    }

}
