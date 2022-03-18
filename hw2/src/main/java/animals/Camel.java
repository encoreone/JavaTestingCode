package animals;

import interfaces.Run;
import interfaces.Voice;

public class Camel extends Herbivore implements Run, Voice {
    public Camel() {
        this.animalName = "Верблюд";
        animalSize = Size.large;
    }

    @Override
    public void run() {
        System.out.println("Бегу");
    }

    @Override
    public String voice() {
        return animalName + " - мычит";
    }
}