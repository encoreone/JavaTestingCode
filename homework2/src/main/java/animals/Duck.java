package animals;

import interfaces.Swim;
import interfaces.Voice;

public class Duck extends Carnivorous implements Swim, Voice {
    public Duck() {
        this.animalName = "Утка";
        animalSize = Size.small;
    }

    @Override
    public String swim() {
        return animalName + " плаваю";
    }

    @Override
    public String voice() {
        return animalName + " - крякает";
    }
}
