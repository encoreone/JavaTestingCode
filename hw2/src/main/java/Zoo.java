import animals.*;
import food.*;
import interfaces.Swim;
import interfaces.Voice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        List<Animal> animalList = new ArrayList<>(
                Arrays.asList(new Camel(), new Duck(), new Eagle(), new Fish(), new Koala(), new Rabbit()
                ));

        Worker worker = new Worker();

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Grass("растение"));
        foodList.add(new Meat("мясо"));

        for (Animal animal : animalList) {
            for (Food food : foodList) {
                worker.feed(animal, food);
            }
        }

        List<Voice> voices = new ArrayList<>(
                Arrays.asList(new Camel(), new Duck(), new Eagle(), new Koala(), new Rabbit()
                ));

        System.out.println("\n");
        for (Voice voice : voices) {
            worker.getVoice(voice);
        }

        List<Swim> swimList = new ArrayList<>(Arrays.asList(new Duck(), new Fish()));
        System.out.println("\n");
        for (Swim swim : swimList) {
            System.out.println(swim.swim() + " - (плавает в пруду)");
        }

        System.out.println("\n");

        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.small);
        Carnivorous duck = new Duck();
        Carnivorous eagle = new Eagle();
        Carnivorous fish = new Fish();

        carnivorousAviary.addAnimalToAviary(duck);
        carnivorousAviary.addAnimalToAviary(eagle);
        carnivorousAviary.addAnimalToAviary(fish);

        carnivorousAviary.removeAnimalToAviary(duck);

        System.out.println(carnivorousAviary.getAnimalOnAviary("Орел"));

        System.out.println("\n");

        Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.normal);
        Herbivore camel = new Camel();
        Herbivore koala = new Koala();
        Herbivore rabbit = new Rabbit();

        herbivoreAviary.addAnimalToAviary(camel);
        herbivoreAviary.addAnimalToAviary(koala);
        herbivoreAviary.addAnimalToAviary(rabbit);

        herbivoreAviary.removeAnimalToAviary(koala);

        System.out.println(herbivoreAviary.getAnimalOnAviary("Кролик"));
    }
}
