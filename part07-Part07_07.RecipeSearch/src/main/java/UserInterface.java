import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    private ArrayList<String> recipeCount;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.recipeCount = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }

    public void start() {
        readFromFile();
        printCommands();
        enterCommand();

    }

    public String getFromSpecificIndexInAList(int fromIndex) {

        String text = "";
        for (int index = fromIndex; index < recipeCount.size() - 1; index++) {
            text += recipeCount.get(index) + " ";
        }
        return text;
    }

    public void readFromFile() {

        System.out.print("File to read: ");
        String input = scanner.nextLine();
        try (Scanner readFile = new Scanner(Paths.get(input))) {
            while (readFile.hasNextLine()) {
                String row = readFile.nextLine();
                recipeCount.add(row);
                if (row.isEmpty()) {
                    String ingredients = getFromSpecificIndexInAList(2);
                    recipes.add(new Recipe(recipeCount.get(0), Integer.valueOf(recipeCount.get(1)), ingredients));
                    recipeCount.clear();
                    continue;
                }
            }

        } catch (Exception e) {
            System.out.println("File is empty or doesn't exist!\nTry Again.");
            readFromFile();
        }
        recipes.add(
                new Recipe(recipeCount.get(0), Integer.valueOf(recipeCount.get(1)), getFromSpecificIndexInAList(2)));

    }

    public void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - search recipes by name");
        System.out.println("find cooking time - search recipes by cooking time");
        System.out.println("find ingredient - search recipes by ingredient");
    }

    public void enterCommand() {
        while (true) {
            System.out.print("Enter command: ");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equals("stop")) {
                return;
            } else if (inputCommand.equals("list")) {
                printList();
            } else if (inputCommand.equals("find name")) {
                findRecipeByName();
            } else if (inputCommand.equals("find cooking time")) {
                findRecipeByCookingTime();
            } else if (inputCommand.equals("find ingredient")) {
                findRecipeByIngredient();
            }
        }

    }

    public void printList() {
        System.out.println("Recipes: \n");
        for (int index = 0; index < recipes.size(); index++) {
            System.out.println(recipes.get(index).getName() + ", cooking time: " + recipes.get(index).getCookingTime());
        }
    }

    public void findRecipeByName() {

        System.out.println("Searched word: ");
        String word = scanner.nextLine();
        boolean isFound = false;
        for (int index = 0; index < recipes.size(); index++) {
            String recipeName = recipes.get(index).getName();

            if (recipeName.contains(word)) {
                System.out.println(
                        recipes.get(index).getName() + ", cooking time: " + recipes.get(index).getCookingTime());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Recipes:");
        }
    }

    public void findRecipeByCookingTime() {

        System.out.print("Max cooking time: ");
        Integer time = Integer.valueOf(scanner.nextLine());
        boolean isFound = false;
        for (int index = 0; index < recipes.size(); index++) {
            int cookingTime = recipes.get(index).getCookingTime();

            if (cookingTime <= time) {
                System.out.println(
                        recipes.get(index).getName() + ", cooking time: " + recipes.get(index).getCookingTime());
                isFound = true;

            }
        }
        if (!isFound) {
            System.out.println("Recipes:");
        }
    }

    public void findRecipeByIngredient() {
        
        System.out.print("Ingredient: ");
        String ingredientName = scanner.nextLine();
        boolean isFound = false;
        
        for (int index = 0; index < recipes.size(); index++) {
            String ingredient = recipes.get(index).getIngredients();
            String[] ingredients = ingredient.split(" ");
            
            for (int i = 0; i < ingredients.length; i++) {
                if (ingredients[i].equals(ingredientName)) {
                    System.out.println(
                            recipes.get(index).getName() + ", cooking time: " + recipes.get(index).getCookingTime());
                    isFound = true;

                }
            }
        }
        if (!isFound) {
            System.out.println("Recipes:");
        }
    }
}
