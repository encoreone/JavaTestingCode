package animals;

public class WrongFoodException extends Exception {
    public WrongFoodException() {
        System.out.println("Вы накормили животного не тем.");
    }
}
