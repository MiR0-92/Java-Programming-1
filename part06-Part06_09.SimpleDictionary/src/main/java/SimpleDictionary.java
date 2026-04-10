
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        String translatedWord = this.translations.get(word);
        if(translatedWord == null){
            return "Word " + word + " was not found";
        }
        return translatedWord;
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
