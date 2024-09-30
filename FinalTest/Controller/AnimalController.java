package FinalTest.Controller;

import java.time.LocalDate;

import FinalTest.Model.Animal;
import FinalTest.Model.impl.*;
import FinalTest.Service.*;
import java.util.ArrayList;

public class AnimalController {

    private CatService catService = new CatService();
    private DogService dogService = new DogService();
    private HamsterService hamsterService = new HamsterService();
    private HorseService horseService = new HorseService();
    private DonkeyService donkeyService = new DonkeyService();
    private CamelService camelService = new CamelService();
    private AnimalService animalService = new AnimalService();

    public Cat createCat(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, ArrayList<String> commands) {
        return catService.createCat(name, location, birthDate, color, weight, ownersName, commands);
    }

    public Dog createDog(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, ArrayList<String> commands) {
        return dogService.createDog(name, location, birthDate, color, weight, ownersName, commands);
    }

    public Hamster createHamster(String name, String location, LocalDate birthDate, String color, int weight, String ownersName, ArrayList<String> commands) {
        return hamsterService.createHamster(name, location, birthDate, color, weight, ownersName, commands);
    }

    public Horse createHorse (String name, String location, LocalDate birthDate, String color, int weight, String ownersOrganizationName, int liftingCapacity, ArrayList<String> commands) {
        return horseService.createHorse(name, location, birthDate, color, weight, ownersOrganizationName, liftingCapacity, commands);
    }

    public Donkey createDonkey (String name, String location, LocalDate birthDate, String color, int weight, String ownersOrganizationName, int liftingCapacity, ArrayList<String> commands) {
        return donkeyService.createDonkey(name, location, birthDate, color, weight, ownersOrganizationName, liftingCapacity, commands);
    }

    public Camel createCamel (String name, String location, LocalDate birthDate, String color, int weight, String ownersOrganizationName, int liftingCapacity, ArrayList<String> commands) {
        return camelService.createCamel(name, location, birthDate, color, weight, ownersOrganizationName, liftingCapacity, commands);
    }

    public void addCommand(Animal animal, String command) {
        animalService.addCommand(animal, command);
    }


}
