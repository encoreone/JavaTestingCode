package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(animalName + " съел - " + food.foodName + " , я это съем, потому что я травоядное.");
        } else {
            System.out.println(animalName + " не съел - " + food.foodName + " - нет, я не буду это есть.");
        }
    }
}
