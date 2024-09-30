package FinalTest.Service;

import FinalTest.Model.RegistryOfAnimal;
import FinalTest.Model.impl.Cat;
import java.time.LocalDate;
import java.util.ArrayList;

public class CatService extends AnimalService {

    RegistryOfAnimal registryOfAnimal = new RegistryOfAnimal();

    public Cat createCat(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, ArrayList<String> commands) {
        int id;
        int sizeListOfCats = registryOfAnimal.getAllCats().size();
        if (sizeListOfCats == 0) {
            id = 1;
        }
        else {
            id = sizeListOfCats + 1;
        }
        Cat cat = new Cat(name, location, birthDate, color, weight, ownersName, id, commands);
        return cat;
    }
}
