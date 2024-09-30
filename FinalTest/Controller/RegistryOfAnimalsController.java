package FinalTest.Controller;

import FinalTest.Model.Animal;
import FinalTest.Service.RegistryOfAnimalService;

public class RegistryOfAnimalsController {

    private RegistryOfAnimalService registryOfAnimalService = new RegistryOfAnimalService();

    public <E extends Animal> void addAnimalinList(E someAnimal) {
        registryOfAnimalService.addAnimalinList(someAnimal);
    }

    public void getAllAnimals() {
        registryOfAnimalService.getAllAnimals();

    }

    public Animal getSpecificAnimal(int numberOfAnimal) {
        return registryOfAnimalService.getSpecificAnimal(numberOfAnimal);
    }

    public int getCountOfAnimals() {
        return registryOfAnimalService.getCountOfAnimals();
    }

    public void getListAnimalByDateOfBirth() {
        registryOfAnimalService.getListAnimalByDateOfBirth();
    }

}
