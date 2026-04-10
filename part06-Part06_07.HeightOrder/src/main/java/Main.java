
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("Empty Room? " + room.isEmpty());

        room.add(new Person("Eva", 160));
        room.add(new Person("Matt", 180));
        room.add(new Person("Forko", 175));
        room.add(new Person("Ana", 170));
        room.add(new Person("Miro", 178));
        room.add(new Person("Gosho", 188));
        room.add(new Person("Iglika", 178));
        room.add(new Person("Martin", 190));
        room.add(new Person("Preslava", 155));
        System.out.println("EMpty room? " + room.isEmpty());
        System.out.println();

        for (Person person : room.getPersons()){
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println();
        for (Person person : room.getPersons()){
            System.out.println(person);
        }
    }
}
