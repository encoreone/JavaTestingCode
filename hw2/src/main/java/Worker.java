import animals.Animal;
import animals.WrongFoodException;
import interfaces.Voice;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) throws WrongFoodException {
        animal.eat(food);
    }

    public void getVoice(Voice voice) {
        System.out.println(voice.voice());
    }
}
