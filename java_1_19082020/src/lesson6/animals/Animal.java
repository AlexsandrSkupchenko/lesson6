package lesson6.animals;

public class Animal {
    protected int name;
    protected int distswim;
    protected int distsrun;

    public Animal(int name, int distsrun, int distswim) {
        this.name = name;
        this.distswim = distswim;
        this.distsrun = distsrun;
    }

    public void info(String nameAnim, int LimitRun, int LimitSwim) {
        if (distsrun <= LimitRun && distswim <= LimitSwim) {
                System.out.println(nameAnim + name + " проплыл " + distswim + "м. и пробежал " + distsrun + "м.");
            } else if (distsrun > LimitRun && distswim <= LimitSwim) {
                System.out.println(nameAnim + name + " проплыл " + distswim + "м., но не пробежал " + distsrun + "м.");
            } else if (distsrun <= LimitRun && distswim > LimitSwim) {
                System.out.println(nameAnim + name + " не проплыл " + distswim + "м., но пробежал " + distsrun + "м.");
            } else {
                System.out.println(nameAnim + name + " не справился с дистанциями");
            }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                ", distswim=" + distswim +
                ", distsrun=" + distsrun +
                '}';
    }
}
