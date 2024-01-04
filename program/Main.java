package program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
import program.Classes.Animal;
import program.Classes.AnimalEnum;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> commands = new ArrayList<>();
        commands.add("Сидеть");
        commands.add("Лежать");
        commands.add("Голос");
        Animal animal = new Animal(1, "Маркиз", commands,  new GregorianCalendar(2019, 03, 12), AnimalEnum.DOG);
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(animal);

        try {
            program.Interface.MainInterface.mainMenu(animalList, scanner);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}