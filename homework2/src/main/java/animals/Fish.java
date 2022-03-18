package animals;

import interfaces.Swim;

public class Fish extends Carnivorous implements Swim {
    public Fish() {
        this.animalName = "Рыба";
        animalSize = Size.small;
    }

    @Override
    public String swim() {
        return animalName + " плаваю";
    }
}
