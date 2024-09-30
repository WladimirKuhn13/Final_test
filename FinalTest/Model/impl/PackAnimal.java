package FinalTest.Model.impl;

import java.time.LocalDate;
import java.util.ArrayList;

import FinalTest.Model.Animal;

public abstract class PackAnimal extends Animal{

    protected int liftingCapacity;
    protected String ownersOrganizationName;
    protected final int idAnimal = 2;
    protected int id;

    public PackAnimal(String name, String location, LocalDate birthDate, String color, int weight, int liftingCapacity, String ownersOrganizationName, int id, ArrayList<String> commands) {
        super(name, location, birthDate, color, weight, id, commands);
        this.liftingCapacity = liftingCapacity;
        this.ownersOrganizationName = ownersOrganizationName;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public String getOwnersOrganizationName() {
        return ownersOrganizationName;
    }

    public void setOwnersOrganizationName(String ownersOrganizationName) {
        this.ownersOrganizationName = ownersOrganizationName;
    }

    @Override
    public String toString() {
        return name + " " + location + " " + birthDate + " " + color + " " + weight + " " + commadns + " " + liftingCapacity + " " + ownersOrganizationName;
    }

}
