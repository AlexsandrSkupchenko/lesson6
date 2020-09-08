package lesson6.animals;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(int name, int distswim, int distsrun) {
        super(name, distswim, distsrun);
        dogCount++;
    }

    public static int getdogCount() {
        return dogCount;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name=" + name +
                ", distswim=" + distswim +
                ", distsrun=" + distsrun +
                '}';
    }
}
