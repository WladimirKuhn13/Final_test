package FinalTest.Model.impl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hamster extends Pet{

    private final int idPet = 3;
    
    public Hamster(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, int id, ArrayList<String> commands) {
        super(name, location, birthDate, color, weight, ownersName, id, commands);
    }

    public int getIdPet() {
        return idPet;
    }

}
