public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", 200, 1.85, 1);
        cat.animalInfo();
        cat.run();
        cat.jump();
        cat.swim();

        System.out.println(" ");

        Animal cat1 = new Cat("Васька", 250, 2.1, 0);
        cat1.animalInfo();
        cat1.run();
        cat1.jump();
        cat1.swim();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        Animal dog = new Dog("Бобик", 499.9, 0.4, 50);
        dog.animalInfo();
        dog.run();
        dog.jump();
        dog.swim();

        System.out.println(" ");

        Animal dog1 = new Dog("Рекс", 558, 1.4, 150);
        dog1.animalInfo();
        dog1.run();
        dog1.jump();
        dog1.swim();
    }
}

