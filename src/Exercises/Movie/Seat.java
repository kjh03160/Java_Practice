package Exercises.Movie;

public class Seat {
    private String name;

    public String getName(){
        return this.name;
    }

    public void reserve(String name){
        this.name = name;
    }

    public void cancel(){
        this.name = null;
    }

    public boolean isOccupied(){
        return this.name != null;
    }

    public boolean match(String checkName){
        return this.name.equals(checkName);
    }
}
