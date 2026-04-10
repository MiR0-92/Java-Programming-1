public class Archive {
    private String id;
    private String name;

    public Archive(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){

        return this.id + ": " + this.name;
    }

    public boolean equals(Object compared){
        //If both objects points to the same address return true
        if(this == compared){
            return true;
        }

        //Checks if the compared object is of the same type as Archive
        if (!(compared instanceof Archive)){
            return true;
        }
        //convert the compared object into Archive type
        Archive convertCompared = (Archive) compared;

        //now lets check if values in compared objects matches with the instance of the object

        if (this.id.equals(convertCompared.id) && this.name.equals(convertCompared.name)){
            return true;
        }

        return false;
    }

}
