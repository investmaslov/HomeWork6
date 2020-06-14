public class Cat extends Animal {
    private double maxRunCat = 200;
    public double maxJumpCat = 2;
    public double maxSwimCat;

    public Cat(String name, double targetRun, double targetJump, double targetSwim) {
        super(name, targetRun, targetJump, targetSwim);

    }
    @Override
    public void jump() {
        if (getTargetJump() <= maxJumpCat) {
            System.out.println("Кот " + name + " успешно прыгнет на " + getTargetJump() + " метров ");
        } else {
            System.out.println("Кот  " + name + " не сможет прыгнуть на: " + getTargetJump() + " метров ");
        }
    }

    @Override
    public void swim() {
        if (getTargetSwim() >= 0) {
            System.out.println("Безполезно кота " + name + " учить плавать! Кот не умеет плавать ");
        }
    }

    @Override
    public void run() {
        if (getTargetRun() <= maxRunCat) {
            System.out.println("Кот " + name + " успешно пробежит расстояние в " + getTargetRun() + " метров");
        } else {
            System.out.println("Кот " + name + " не сможет пробежать расстояние в " + getTargetRun() + " метров");
        }
    }


    @Override
    public void animalInfo() {
        System.out.println("Имя кота " + name);
//        System.out.println(" ");
//        System.out.println("Максимальное расстояние которое может пробежать кот: " + maxRunCat);
//        System.out.println("Максимальный прыжок кота: " + maxJumpCat);
//        System.out.println("Максимальный заплыв кота: " + maxSwimCat);


    }


}



