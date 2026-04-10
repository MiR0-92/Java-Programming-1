import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room(){
        this.room = new ArrayList<>();
    }

    public boolean isEmpty(){

        return this.room.isEmpty();
    }

    public void add(Person person){
        this.room.add(person);
    }

    public ArrayList<Person> getPersons(){

        return this.room;
    }

    public Person shortest(){
        if (this.room.isEmpty()){
            return null;
        }
        Person shortestPerson = this.room.get(0);

        for (Person person : this.room){
            if (shortestPerson.getHeight() > person.getHeight()){
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public Person take(){

        if (room.isEmpty()){
            return null;
        }
        Person shortestPerson = this.shortest();
        this.room.remove(shortestPerson);
    
        return shortestPerson;
    }
}
