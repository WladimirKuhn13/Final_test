package FinalTest.Model.impl;

import java.time.LocalDate;
import FinalTest.Model.Animal;
import java.util.ArrayList;

public abstract class Pet extends Animal {
    
    protected String ownersName;
    protected final int idAnimal = 1;
    protected int id;

    public Pet(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, int id, ArrayList<String> commadns) {
        super(name, location, birthDate, color, weight, id, commadns);
        this.ownersName = ownersName;

    }


    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    @Override
    public String toString() {
        return name + " " + location + " " + birthDate + " " + color + " " + weight + " " + commadns + " " + ownersName;
    }
}
