import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik(12, 5, "Барсик", "мяу");

        Kotik kotikTwo = new Kotik();

        kotikTwo.setKotik(13, 6, "Борис", "мяу");
        kotikTwo.setSatiety(30);

        System.out.println("Имя кота - " + kotikTwo.getName());
        System.out.println(kotikTwo.getName() + " весит " + kotikTwo.getWeight() + " кг");
        System.out.println("Сытость кота = " + kotikTwo.getSatiety() + '\n');

        kotikTwo.liveAnotherDay();

        System.out.println('\n');
        System.out.println("Сравниваем мяу: " + kotik.getMeow().equals(kotikTwo.getMeow()));

        int count = kotik.getCount();

        System.out.println('\n');
        System.out.println("Созданных экземпляров класса: " + count);
    }
}
