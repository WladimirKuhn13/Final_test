package FinalTest.Model;

import java.time.LocalDate;
import java.util.ArrayList;


public abstract class Animal implements Comparable<Animal>{
    protected int id;
    protected String name;
    protected String location;
    protected LocalDate birthDate;
    protected String color;
    protected int weight;
    protected ArrayList<String> commadns;

    public Animal(String name, String location, LocalDate birthDate, String color, int weight, int id, ArrayList<String> commands) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
        this.color = color;
        this.weight = weight;
        this.commadns = new ArrayList<>();
        this.id = id;
        this.commadns = commands;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return birthDate;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public ArrayList<String> getCommands() {
        return commadns;
    }

    @Override
    public int compareTo(Animal o) {
        return this.getDate().compareTo(o.getDate());
    }
    
}
