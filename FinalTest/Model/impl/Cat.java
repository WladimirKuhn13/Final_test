package FinalTest.Model.impl;

import java.util.ArrayList;
import java.time.LocalDate;

public class Cat extends Pet{
    
    private final int idPet = 1;

    public Cat(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, int id, ArrayList<String> commands) {
        super(name, location, birthDate, color, weight, ownersName, id, commands);
    }

    public int getIdPet() {
        return idPet;
    }
}
