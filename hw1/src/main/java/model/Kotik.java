package model;

public class Kotik {
    private static int count;
    private int prettiness;
    private int weight;
    private int satiety;
    private String name;
    private String meow;
    private String foodName;


    public Kotik() {
        count++;
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        count++;
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }

    public void setKotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }


    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }


    public int getPrettiness() {
        return prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    public int getCount() {
        return count;
    }

    public int getSatiety() {
        return satiety;
    }

    public String getFoodName() {
        return foodName;
    }


    public boolean play() {
        if (satiety <= 0) {
            System.out.println("Я ничего не буду делать, я хочу есть!");
            return false;
        }

        System.out.println("Играет - " + "сытость кота: " + satiety);
        satiety -= 2;

        return true;
    }

    public boolean sleep() {
        if (satiety <= 0) {
            System.out.println("Я ничего не буду делать, я хочу есть!");
            return false;
        }

        System.out.println("Спит - " + "сытость кота: " + satiety);
        satiety -= 2;

        return true;
    }

    public boolean chaseMouse() {
        if (satiety <= 0) {
            System.out.println("Я ничего не буду делать, я хочу есть!");
            return false;
        }

        System.out.println("Ловит мышку - " + "сытость кота: " + satiety);
        satiety -= 2;

        return true;
    }

    public boolean run() {
        if (satiety <= 0) {
            System.out.println("Я ничего не буду делать, я хочу есть!");
            return false;
        }

        System.out.println("Бегает - " + "сытость кота: " + satiety);
        satiety -= 2;

        return true;
    }

    public boolean walk() {
        if (satiety <= 0) {
            System.out.println("Я ничего не буду делать, я хочу есть!");
            return false;
        }

        System.out.println("Гуляет - " + "сытость кота: " + satiety);
        satiety -= 2;

        return true;
    }

    public void eat(int satiety) {
        this.satiety += satiety;
        System.out.println("Я захотел есть, но поел китикета и прибавил 5 к сытости!");
    }

    public void eat(int satiety, String foodName) {
    }

    public void eat() {
        eat(20, "Китикет");
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; ++i) {
            int count = (int) (Math.random() * 5 + 1);

            switch (count) {
                case 1:
                    if (satiety <= 0) {
                        eat(5);
                    } else {
                        play();
                    }
                    break;
                case 2:
                    if (satiety <= 0) {
                        eat(5);
                    } else {
                        sleep();
                    }
                    break;
                case 3:
                    if (satiety <= 0) {
                        eat(5);
                    } else {
                        chaseMouse();
                    }
                    break;
                case 4:
                    if (satiety <= 0) {
                        eat(5);
                    } else {
                        walk();
                    }
                    break;
                case 5:
                    if (satiety <= 0) {
                        eat(5);
                    } else {
                        run();
                    }
                    break;
                default:
                    System.out.println("Дефолт");
                    break;
            }
        }
    }
}