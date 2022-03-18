package animals;

import food.Food;

public abstract class Animal {
    protected String animalName;
    public Size animalSize;

    public Size getAnimalSize() {
        return animalSize;
    }

    public String getAnimalName() {
        return animalName;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    @Override
    public int hashCode() {
        return animalName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.animalName == getAnimalName().toString() || (getAnimalSize() != null && animalName.equals(getAnimalName().toString()));
    }
}
