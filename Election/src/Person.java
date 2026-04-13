public class Person {
    private String name;
    private int vote;

    public Person(String name){
        this.name = name;
        this.vote = 0;
    }

    public String getName(){
        return this.name;
    }
    
    public int getVotes(){
        return this.vote;
    }

    public int increaseVoteCountByOne(){
        return this.vote++;
    }

    @Override
    public String toString(){
        return this.name + " received " + this.vote + " votes";
    }

    @Override
    public boolean equals(Object other){

        if (this == other){
            return true;
        }

        if (!(other instanceof Person)){
            return false;
        }

        Person convertOther = (Person) other;

        if (this.getName().equals(convertOther.getName())){
            return true;
        }
        return false;
    }
}
