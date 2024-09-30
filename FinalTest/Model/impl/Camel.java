package FinalTest.Model.impl;

import java.util.ArrayList;
import java.time.LocalDate;

public class Camel extends PackAnimal{
    
        private final int idPackAnimal = 1;

        public Camel (String name, String location, LocalDate birthDate, String color, int weight, String ownersOrganizationName, int liftingCapacity, int id, ArrayList<String> commands) {
                super(name, location, birthDate, color, weight, liftingCapacity, ownersOrganizationName, id, commands);
        }

        public int getIdPackAnimal() {
                return idPackAnimal;
            }

}
