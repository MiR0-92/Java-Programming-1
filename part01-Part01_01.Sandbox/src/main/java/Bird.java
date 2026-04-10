public class Bird {
private String name;

public Bird(String birdName) {
    this.name = birdName;
}
@Override
public boolean equals(Object compared){

    if (this == compared){
        return true;
    }

    if(!(compared instanceof Bird)){
        return false;
    }

    Bird convertCompared = (Bird) compared;

    if (this.name.equals(convertCompared.name)){
        return true;
    }
    return false;
}

}
