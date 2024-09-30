package FinalTest.Service;

import FinalTest.Model.RegistryOfAnimal;
import FinalTest.Model.impl.Dog;
import java.time.LocalDate;
import java.util.ArrayList;

public class DogService extends AnimalService {

        RegistryOfAnimal registryOfAnimal = new RegistryOfAnimal();

        public Dog createDog(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, ArrayList<String> commands) {
        int id;
        int sizeListOfDogs = registryOfAnimal.getAllDogs().size();
        if (sizeListOfDogs == 0) {
            id = 1;
        }
        else {
            id = sizeListOfDogs + 1;
        }
        Dog dog = new Dog(name, location, birthDate, color, weight, ownersName, id, commands);
        return dog;
    }
}
