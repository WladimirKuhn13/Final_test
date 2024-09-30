package FinalTest.Model.impl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horse extends PackAnimal{
    
        private final int idPackAnimal = 1;

        public Horse (String name, String location, LocalDate birthDate, String color, int weight, String ownersOrganizationName, int liftingCapacity, int id, ArrayList<String> commands) {
                super(name, location, birthDate, color, weight, liftingCapacity, ownersOrganizationName, id, commands);
        }

        public int getIdPackAnimal() {
                return idPackAnimal;
            }

}
