import animals.Animal;
import animals.Size;

import java.util.HashSet;
import java.util.Set;

public class Aviary<T extends Animal> {
    private final Set<T> set = new HashSet<>();
    private final Size size;

    public Aviary(Size size) {
        this.size = size;
    }

    public boolean addAnimalToAviary(T animal) {
        boolean animalInAviary = false;

        switch (animal.getAnimalSize()) {
            case small:
            case large:
                if (animal.animalSize == size) {
                    set.add(animal);
                    System.out.println("Животное добавлено в вольер");
                    animalInAviary = true;
                }
                break;
            case normal:
                if (animal.animalSize == size && animal.animalSize != Size.big) {
                    set.add(animal);
                    System.out.println("Животное добавлено в вольер");
                    animalInAviary = true;
                }
                break;
            case big:
                if (animal.animalSize == size && animal.animalSize != Size.normal) {
                    set.add(animal);
                    System.out.println("Животное добавлено в вольер");
                    animalInAviary = true;
                }
                break;
        }
        return animalInAviary;
    }

    public boolean removeAnimalToAviary(T animal) {
        return set.remove(animal);
    }

    public boolean getAnimalOnAviary(String animalName) {
        for (Animal animal : set) {
            if (animalName.hashCode() == animal.getAnimalName().hashCode() && animal.equals(set)) {
                return true;
            }
        }
        return false;
    }
}
