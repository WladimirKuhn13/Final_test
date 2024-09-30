package FinalTest.Model;

import java.util.ArrayList;
import java.util.List;

import FinalTest.Model.impl.Camel;
import FinalTest.Model.impl.Cat;
import FinalTest.Model.impl.Dog;
import FinalTest.Model.impl.Donkey;
import FinalTest.Model.impl.Hamster;
import FinalTest.Model.impl.Horse;
import FinalTest.Model.impl.PackAnimal;
import FinalTest.Model.impl.Pet;

public class RegistryOfAnimal {

    protected  List<Animal> animals;
    protected  List<Pet> pets; 
    protected  List<PackAnimal> packAnimals; 
    protected  List<Cat> cats; 
    protected  List<Dog> dogs; 
    protected  List<Hamster> hamsters;
    protected  List<Horse> horses; 
    protected  List<Camel> camels;
    protected  List<Donkey> donkeys; 
    protected int countOfAnimals;

    public RegistryOfAnimal() {
        this.animals = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.packAnimals = new ArrayList<>();
        this.cats = new ArrayList<>();
        this.dogs = new ArrayList<>();
        this.hamsters = new ArrayList<>();
        this.horses = new ArrayList<>();
        this.camels = new ArrayList<>();
        this.donkeys = new ArrayList<>();
        this.countOfAnimals = 0;

    }



    public List<Animal> getAllAnimals() {
        return animals;
    }

    public List<Pet> getAllPets() {
        return pets;
    }

    public List<PackAnimal> getAllPackAnimals() {
        return packAnimals;
    }

    public List<Cat> getAllCats() {
        return cats;
    }

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public List<Hamster> getAllHamsters() {
        return hamsters;
    }

    public List<Horse> getAllHorses() {
        return horses;
    }

    public List<Donkey> getAllDonkeys() {
        return donkeys;
    }

    public List<Camel> getAllCamels() {
        return camels;
    }

    public int getCountOfAnimals() {
        return countOfAnimals;
    }

    public void setCountOfAnimals() {
        countOfAnimals++;
    }
    
}
