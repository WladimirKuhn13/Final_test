package FinalTest.Service;

import FinalTest.Model.RegistryOfAnimal;
import FinalTest.Model.impl.Horse;
import java.time.LocalDate;
import java.util.ArrayList;

public class HorseService extends AnimalService {

        RegistryOfAnimal registryOfAnimal = new RegistryOfAnimal();
        
        public Horse createHorse(String name, String location, LocalDate birthDate, String color, int weight, String ownersOrganizationName, int liftingCapacity, ArrayList<String> commands) {
        int id;
        int sizeListOfHorses = registryOfAnimal.getAllHorses().size();
        if (sizeListOfHorses == 0) {
            id = 1;
        }
        else {
            id = sizeListOfHorses + 1;
        }
        Horse horse = new Horse(name, location, birthDate, color, weight, ownersOrganizationName, liftingCapacity, id, commands);
        return horse;
    }
}
