package animals;

import interfaces.Run;
import interfaces.Voice;

public class Koala extends Herbivore implements Run, Voice {
    public Koala() {
        this.animalName = "Коала";
        animalSize = Size.normal;
    }

    @Override
    public void run() {
        System.out.println("Бегу");
    }

    @Override
    public String voice() {
        return animalName + " - крехтит";
    }
}
