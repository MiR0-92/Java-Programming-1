
public class Main {
        public static void main(String[] args) {
                Menu menu = new Menu();

                menu.addMeal("Sandwich");
                menu.addMeal("Tuna with chips");
                menu.addMeal("Hamburger");
                menu.addMeal("Hamburger");
                menu.addMeal("Hot Dog");
                menu.addMeal("Moussaka");

                menu.printMeals();
                menu.clearMenu();

                System.out.println();
                menu.addMeal("Pizza");
                menu.printMeals();
        }
}
