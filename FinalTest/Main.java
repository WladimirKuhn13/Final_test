package FinalTest;

import java.rmi.registry.Registry;
import java.time.LocalDate;

import FinalTest.Model.*;
import FinalTest.Model.RegistryOfAnimal;
import FinalTest.Model.impl.Cat;
import FinalTest.View.RegistryOfAnimalsView;


public class Main {
    public static void main(String[] args) {
        // Animal kitty = new Cat("Kitty", "Location", LocalDate.of(2022, 01, 11), "White", 10, "Mike", 1);
        // System.out.println(kitty);

        // kitty.getCommands().add("голос");
        // System.out.println(kitty.getCommands());

        // RegistryOfAnimal reg = new RegistryOfAnimal();
        // reg.getAllCats();



        new RegistryOfAnimalsView().start();


    }
}
