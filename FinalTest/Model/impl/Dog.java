package FinalTest.Model.impl;

import java.util.ArrayList;
import java.time.LocalDate;

public class Dog extends Pet{
    
    private final int idPet = 2;

    public Dog(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, int id, ArrayList<String> commands) {
        super(name, location, birthDate, color, weight, ownersName, id, commands);
    }

    public int getIdPet() {
        return idPet;
    }
}
