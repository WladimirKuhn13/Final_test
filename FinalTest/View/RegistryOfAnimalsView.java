package FinalTest.View;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import FinalTest.Controller.AnimalController;
import FinalTest.Controller.RegistryOfAnimalsController;
import FinalTest.Exceptions.CorrectnessDateException;
import FinalTest.Exceptions.NotNumberException;
import FinalTest.Exceptions.NumberAnimalException;
import FinalTest.Model.Animal;




public class RegistryOfAnimalsView {

    AnimalController animalController = new AnimalController();
    RegistryOfAnimalsController registryOfAnimalsController = new RegistryOfAnimalsController();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - добавить новое животное");
            System.out.println("2 - вывести список команд животного");
            System.out.println("3 - обучить животное новым командам");
            System.out.println("4 - вывести список всех животных");
            System.out.println("5 - вывести количество всех животных в реестре");
            System.out.println("6 - вывести список животных по дате рождения");
            System.out.println("7 - выход");

            switch (scanner.nextInt()) {
                case 1 -> addAnimals();
                case 2 -> getCommands();
                case 3 -> addCommands();
                case 4 -> getAllAnimals();
                case 5 -> getCountOfAnimals();
                case 6 -> getListAnimalByDateOfBirth();
                case 7 -> System.exit(0);

                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private void addAnimals() {
        Animal someAnimal = null;
        Scanner scanner = new Scanner(System.in);
        int numberAnimal = selectingAnimal();

        if (numberAnimal == 1 || numberAnimal == 2 || numberAnimal == 3) {
            someAnimal = createPet(numberAnimal);
        } else if ((numberAnimal == 4 || numberAnimal == 5 || numberAnimal == 6)) {
            someAnimal = createPackAnimal(numberAnimal);
        }

        registryOfAnimalsController.addAnimalinList(someAnimal);

    }

    private int selectingAnimal() throws NumberAnimalException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, какое животное вы хотите добавить:");
        System.out.println("1 - кошку");
        System.out.println("2 - собаку");
        System.out.println("3 - хомяка");
        System.out.println("4 - верблюда");
        System.out.println("5 - лошадь");
        System.out.println("6 - осла");
        int result = scanner.nextInt();
        if (result < 0 || result > 6) {
            throw new NumberAnimalException("Вы ввели неверное число");
        }
        return result;
    }

    private Animal createPet(int numberAnimal) throws NotNumberException{
    
        Animal somePet = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите адрес животного:");
        String location = scanner.nextLine();
        System.out.println("Введите цвет животного:");
        String color = scanner.nextLine();
        System.out.println("Введите имя владельца животного:");
        String ownersName = scanner.nextLine();
        System.out.println("Введите через запятую команды, которое знает животное:");
        String stringCommands = scanner.nextLine();
        ArrayList<String> commands = new ArrayList<>(Arrays.asList(stringCommands.split(",")));
        System.out.println("Введите год рождения животного:");
        String stringBirthYear = scanner.nextLine();
        int birthYear = checkForNumber(stringBirthYear);
        checkCorrectnessOfYear(birthYear);

        System.out.println("Введите месяц рождения животного:");
        String stringBirthMonth = scanner.nextLine();
        int birthMonth = checkForNumber(stringBirthMonth);
        checkCorrectnessOfMonth(birthMonth);

        System.out.println("Введите день рождения животного:");
        String stringBirthDay = scanner.nextLine();
        int birthDay = checkForNumber(stringBirthDay);
        checkCorrectnessOfDay(birthDay);

        System.out.println("Введите вес животного:");
        String stringWeight = scanner.nextLine();
        int weight = checkForNumber(stringWeight);


        if (numberAnimal == 1) {
            somePet = animalController.createCat(name, location, LocalDate.of(birthYear, birthMonth, birthDay), color, weight, ownersName, commands);
        } else if (numberAnimal == 2) {
            somePet = animalController.createDog(name, location, LocalDate.of(birthYear, birthMonth, birthDay), color, weight, ownersName, commands);
        } else if (numberAnimal == 3) {
            somePet = animalController.createHamster(name, location, LocalDate.of(birthYear, birthMonth, birthDay), color, weight, ownersName, commands);
        }
        return somePet;
    }

    private Animal createPackAnimal(int numberAnimal) {
    
        Animal somePackAnimal = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите адрес животного:");
        String location = scanner.nextLine();
        System.out.println("Введите цвет животного:");
        String color = scanner.nextLine();
        System.out.println("Введите название компании-владельца животного:");
        String ownersOrganizationName = scanner.nextLine();
        System.out.println("Введите через запятую команды, которое знает животное:");
        String stringCommands = scanner.nextLine();
        System.out.println("Введите год рождения животного:");
        String stringBirthYear = scanner.nextLine();
        int birthYear = checkForNumber(stringBirthYear);
        checkCorrectnessOfYear(birthYear);

        System.out.println("Введите месяц рождения животного:");
        String stringBirthMonth = scanner.nextLine();
        int birthMonth = checkForNumber(stringBirthMonth);
        checkCorrectnessOfMonth(birthMonth);

        System.out.println("Введите день рождения животного:");
        String stringBirthDay = scanner.nextLine();
        int birthDay = checkForNumber(stringBirthDay);
        checkCorrectnessOfDay(birthDay);

        System.out.println("Введите вес животного:");
        String stringWeight = scanner.nextLine();
        int weight = checkForNumber(stringWeight);

        ArrayList<String> commands = new ArrayList<>(Arrays.asList(stringCommands.split(",")));
        System.out.println("Введите грузоподъемность животного:");
        String stringliftingCapacity = scanner.nextLine();
        int liftingCapacity = checkForNumber(stringliftingCapacity);

        if (numberAnimal == 4) {
            somePackAnimal = animalController.createCamel(name, location, LocalDate.of(birthYear, birthMonth, birthDay), color, weight, ownersOrganizationName, liftingCapacity, commands);
        } else if (numberAnimal == 5) {
            somePackAnimal = animalController.createHorse(name, location, LocalDate.of(birthYear, birthMonth, birthDay), color, weight, ownersOrganizationName, liftingCapacity, commands);
        } else if (numberAnimal == 6) {
            somePackAnimal = animalController.createDonkey(name, location, LocalDate.of(birthYear, birthMonth, birthDay), color, weight, ownersOrganizationName, liftingCapacity, commands);
        }
        
        return somePackAnimal;
    }

    private void getAllAnimals() {
        registryOfAnimalsController.getAllAnimals();
    }

    private void addCommands() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через запятую команды, которыми хотите обучить выбранное животное: ");
        String someCommands = scanner.nextLine();
        getAllAnimals();
        System.out.println("Введите номер животного, которому хотите добавить новые команды:");
        int numberOfAnimal = scanner.nextInt();
        Animal animal = registryOfAnimalsController.getSpecificAnimal(numberOfAnimal);
        animalController.addCommand(animal, someCommands);
    }

    private void getCommands() {
        Scanner scanner = new Scanner(System.in);
        getAllAnimals();
        System.out.println("Введите номер животного, команды которого хотите просмотреть:");
        int numberOfAnimal = scanner.nextInt();
        Animal animal = registryOfAnimalsController.getSpecificAnimal(numberOfAnimal);
        System.out.println(animal.getCommands()); 
    }

    private void getCountOfAnimals() {
        System.out.println("Количество животных в реестре =" + " " + registryOfAnimalsController.getCountOfAnimals()); 
    }

    private void getListAnimalByDateOfBirth() {
        registryOfAnimalsController.getListAnimalByDateOfBirth();
    }

    private int checkForNumber(String stringNumber) throws NumberFormatException {
        int number = 0;
        try {
            number = Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            System.err.println("Введенный параметр не является числом\nНачните процедуру снова");
            System.exit(0);
        }
        return number;
    }

    private void checkCorrectnessOfYear(int year) throws CorrectnessDateException{
        if (year > LocalDate.now().getYear()) {
            throw new CorrectnessDateException("Год рождения животного не может быть больше текущего");
        }
    }

    private void checkCorrectnessOfMonth(int month) throws CorrectnessDateException{
        if (month > 12 || month < 0) {
            throw new CorrectnessDateException("Месяц рождения животного не может не может быть больше 12 или меньше 0");
        }
    }

    private void checkCorrectnessOfDay(int day) throws CorrectnessDateException{
        if (day > 31 || day < 0) {
            throw new CorrectnessDateException("День рождения животного не может не может быть больше 31 или меньше 0");
        }
    }

}
