public abstract class Animal {
    protected String name;
    private double targetRun;
    private double targetJump;
    private double targetSwim;


    public Animal(String name, double targetRun, double targetJump, double targetSwim) {
        this.name = name;
        this.targetRun = targetRun;
        this.targetJump = targetJump;
        this.targetSwim = targetSwim;
    }

    public double getTargetRun() {
        return targetRun;
    }

    public double getTargetJump() {
        return targetJump;
    }

    public double getTargetSwim() {
        return targetSwim;
    }

    public void run() {
    }

    public void jump() {
    }

    public void swim() {

    }
    public void animalInfo() {
        System.out.println(" Имя живтоного " + name);
    }
}
