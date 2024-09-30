package FinalTest.Service;

import FinalTest.Model.RegistryOfAnimal;
import FinalTest.Model.impl.Camel;
import java.time.LocalDate;
import java.util.ArrayList;

public class CamelService extends AnimalService {

        RegistryOfAnimal registryOfAnimal = new RegistryOfAnimal();

        public Camel createCamel(String name, String location, LocalDate birthDate, String color, int weight, String ownersOrganizationName, int liftingCapacity, ArrayList<String> commands) {
        int id;
        int sizeListOfCamels = registryOfAnimal.getAllCamels().size();
        if (sizeListOfCamels == 0) {
            id = 1;
        }
        else {
            id = sizeListOfCamels + 1;
        }
        Camel camel = new Camel(name, location, birthDate, color, weight, ownersOrganizationName, liftingCapacity, id, commands);
        return camel;
    }
}
