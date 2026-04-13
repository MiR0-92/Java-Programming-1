public class Fruit {
    private String name;
    private double price;


    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return 1.0 * this.price;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.price + "$";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Fruit)) {
            return false;
        }
        Fruit converted = (Fruit) other;

        if(this.name.equals(converted.getName())){
            return true;
        }
        return false;
    }
}
