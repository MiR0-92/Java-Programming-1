

import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String message = "The collection " + name;
        if (elements.isEmpty()){
            return message + " is empty.";
        } else if (elements.size() == 1){
            return message = message + " has " + elements.size() + " element:" + "\n" + elements.get(0); 
        }
        String newMessage = "";
        for (String name : elements){
            newMessage = newMessage + "\n" + name;
        }

        return message + " has " + elements.size() + " elements:" + newMessage;
    }
}
