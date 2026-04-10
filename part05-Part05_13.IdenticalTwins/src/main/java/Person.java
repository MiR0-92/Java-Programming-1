
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects

    public boolean equals(Object compared) {
        // If both objects are same type and references the same object
        if (this == compared) {
            return true;
        }

        // If the compared object is not the same type, return false;
        if (!(compared instanceof Person)) {
            return false;
        }
        // Convert the compared object into Person type
        Person convertCompared = (Person) compared;

        // Make comparison with the convertCompared

        if (this.name.equals(convertCompared.name) &&
                this.birthday.equals(convertCompared.birthday) &&
                this.height == convertCompared.height && this.weight == convertCompared.weight) {
            return true;
        }
        return false;
    }
}
