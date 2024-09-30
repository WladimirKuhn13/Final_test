package FinalTest.Service;
import java.util.ArrayList;
import java.util.Arrays;

import FinalTest.Model.Animal;

public class AnimalService {
    
    public void addCommand(Animal animal, String commands) {
        ArrayList<String> listCommands = new ArrayList<>(Arrays.asList(commands.split(",")));
        for (String command : listCommands) {
            animal.getCommands().add(command);
            System.out.println("Команда" + " " + command + " добавлена!");
        }
        // animal.getCommands().add(commands);
        // System.out.println("Команда" + " " + commands + " добавлена!");
    }
}
