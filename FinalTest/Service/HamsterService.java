package FinalTest.Service;

import FinalTest.Model.RegistryOfAnimal;
import FinalTest.Model.impl.Hamster;
import java.time.LocalDate;
import java.util.ArrayList;

public class HamsterService extends AnimalService{

        RegistryOfAnimal registryOfAnimal = new RegistryOfAnimal();
        
        public Hamster createHamster(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, ArrayList<String> commands) {
        int id;
        int sizeListOfHamsters = registryOfAnimal.getAllHamsters().size();
        if (sizeListOfHamsters == 0) {
            id = 1;
        }
        else {
            id = sizeListOfHamsters + 1;
        }
        Hamster hamster = new Hamster(name, location, birthDate, color, weight, ownersName, id, commands);
        return hamster;
    }
}
