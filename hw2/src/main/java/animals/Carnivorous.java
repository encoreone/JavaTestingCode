package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(animalName + " съел - " + food.foodName + " , я это съем, потому что я хищник");
        } else {
            System.out.println(animalName + " не съел - " + food.foodName + " - нет, я не буду это есть.");
        }
    }
}
