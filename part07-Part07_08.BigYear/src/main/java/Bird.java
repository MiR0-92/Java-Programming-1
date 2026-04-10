
public class Bird {
private String name;
private String latinName;
private int seen;

public Bird(String name, String latinName){
    this.name = name;
    this.latinName = latinName;
    this.seen = 0;
}

public String getName(){
    return this.name;
}

public String getLatinName(){
    return this.latinName;
}

public int getObservedBird(){
    return this.seen;
}

public void markedAsSeen(){
    this.seen += 1;
}

@Override
public String toString(){
    return this.name + " (" + this.latinName + "): " + this.seen +" observations";
}

@Override
public boolean equals(Object compared){

    if (this == compared){
        return true;
    }
    if (!(compared instanceof Bird)){
        return false;
    }
    Bird convertCompared = (Bird) compared;
    if (this.name.equals(convertCompared.name) && this.latinName.equals(convertCompared.latinName)){
        return true;
    }
    return false;
}
}
