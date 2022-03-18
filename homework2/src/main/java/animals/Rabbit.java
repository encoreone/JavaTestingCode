package animals;

import interfaces.Run;
import interfaces.Voice;

public class Rabbit extends Herbivore implements Run, Voice {
    public Rabbit() {
        this.animalName = "Кролик";
        animalSize = Size.normal;
    }

    @Override
    public void run() {
        System.out.println("Бегу");
    }

    @Override
    public String voice() {
        return animalName + " - низкочастотный звук";
    }
}
