package FinalTest.Service;


import FinalTest.Model.Animal;
import FinalTest.Model.RegistryOfAnimal;
import FinalTest.Model.impl.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class RegistryOfAnimalService {
    
    private RegistryOfAnimal registryOfAnimal = new RegistryOfAnimal();

    public <E extends Animal> void addAnimalinList(E someAnimal) {
        if (someAnimal instanceof Cat) {
            Cat cat = (Cat) someAnimal;
            registryOfAnimal.getAllCats().add(cat);
            registryOfAnimal.getAllAnimals().add(cat);
            registryOfAnimal.getAllPets().add(cat);
            System.out.println("Кошка добавлена");
        } 
        else if (someAnimal instanceof Dog) {
            Dog dog = (Dog) someAnimal;
            registryOfAnimal.getAllDogs().add(dog);
            registryOfAnimal.getAllAnimals().add(dog);
            registryOfAnimal.getAllPets().add(dog);
        }
        else if (someAnimal instanceof Hamster) {
            Hamster hamster = (Hamster) someAnimal;
            registryOfAnimal.getAllHamsters().add(hamster);
            registryOfAnimal.getAllAnimals().add(hamster);
            registryOfAnimal.getAllPets().add(hamster);
        }
        else if (someAnimal instanceof Camel) {
            Camel camel = (Camel) someAnimal;
            registryOfAnimal.getAllCamels().add(camel);
            registryOfAnimal.getAllPackAnimals().add(camel);
            registryOfAnimal.getAllAnimals().add(camel);
        }
        else if (someAnimal instanceof Horse) {
            Horse horse = (Horse) someAnimal;
            registryOfAnimal.getAllHorses().add(horse);
            registryOfAnimal.getAllPackAnimals().add(horse);
            registryOfAnimal.getAllAnimals().add(horse);
        }
        else if (someAnimal instanceof Donkey) {
            Donkey donkey = (Donkey) someAnimal;
            registryOfAnimal.getAllDonkeys().add(donkey);
            registryOfAnimal.getAllPackAnimals().add(donkey);
            registryOfAnimal.getAllAnimals().add(donkey);
        }
        registryOfAnimal.setCountOfAnimals();
    }

    public void getAllAnimals() {
        List<Animal> allAnimal = registryOfAnimal.getAllAnimals();
        int numberOfAnimal = 1;
        for (Animal animal : allAnimal) {
            System.out.println(numberOfAnimal + "." + " " + animal);
            numberOfAnimal++;
        }
    }

    public Animal getSpecificAnimal(int numberOfAnimal) {
        List<Animal> allAnimal = registryOfAnimal.getAllAnimals();
        Animal animal = allAnimal.get(numberOfAnimal - 1);
        return animal;
    }

    public int getCountOfAnimals() {
        int countOfAnimals = registryOfAnimal.getCountOfAnimals();
        return countOfAnimals;
    }

    public void getListAnimalByDateOfBirth() {
        List<Animal> allAnimal = registryOfAnimal.getAllAnimals();
        Collections.sort(allAnimal);
        for (Animal animal : allAnimal) {
            System.out.println("1." + " " + animal);
        }
    }


}
