public class Dog extends Animal {
    private double maxRunDog = 500;
    public double maxJumpDog = 0.5;
    public double maxSwimDog = 10;

    public Dog(String name, double targetRun, double targetJump, double targetSwim) {
        super(name, targetRun, targetJump, targetSwim);
    }

    @Override
    public void jump() {
        if (getTargetJump() <= maxJumpDog) {
            System.out.println("Собака " + name + " успешно прыгнет" + getTargetJump() + " метров ");
        } else {
            System.out.println("Собака " + name + " не сможет прыгнуть на: " + getTargetJump() + " метров ");
        }
    }

    @Override
    public void swim() {
        if (getTargetSwim() <= maxSwimDog) {
            System.out.println("Собака " + name + " успешно проплывет " + getTargetSwim() + " метров ");
        } else {
            System.out.println("Собака " + name + " не сможет проплыть на: " + getTargetSwim() + " метров ");
        }

    }

    @Override
    public void run() {
        if (getTargetRun() <= maxRunDog) {
            System.out.println("Собака " + name + " успешно пробежит расстояние" + getTargetRun());
        } else {
            System.out.println("Собака " + name + " не сможет пробежать рассояние " + getTargetRun());
        }
    }

    @Override
    public void animalInfo() {
        System.out.println("Имя собаки: " + name);
//        System.out.println(" ");
//        System.out.println("Максимальное расстояние которое может пробежать собака : " + maxRunDog);
//        System.out.println("Максимальный прыжок собаки: " + maxJumpDog);
//        System.out.println("Максимальный заплыв собаки: " + maxSwimDog);

    }
}
