package FinalTest.Service;

import FinalTest.Model.RegistryOfAnimal;
import FinalTest.Model.impl.Donkey;
import java.time.LocalDate;
import java.util.ArrayList;

public class DonkeyService extends AnimalService {

        RegistryOfAnimal registryOfAnimal = new RegistryOfAnimal();
        
        public Donkey createDonkey(String name, String location, LocalDate birthDate, String color, int weight, String ownersOrganizationName, int liftingCapacity, ArrayList<String> commands) {
        int id;
        int sizeListOfDonkeys = registryOfAnimal.getAllDonkeys().size();
        if (sizeListOfDonkeys == 0) {
            id = 1;
        }
        else {
            id = sizeListOfDonkeys + 1;
        }
        Donkey donkey = new Donkey(name, location, birthDate, color, weight, ownersOrganizationName, liftingCapacity, id, commands);
        return donkey;
    }
}
