package animals;

import interfaces.Fly;
import interfaces.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {
    public Eagle() {
        this.animalName = "Орел";
        animalSize = Size.big;
    }

    @Override
    public void fly() {
        System.out.println("Лечу");
    }

    @Override
    public String voice() {
        return animalName + " - клекочет";
    }
}
