package lesson6.animals;

public class Cat extends Animal {
    private static int catCount = 0;

    public Cat(int name, int distswim, int distsrun) {
        super(name, distswim, distsrun);
        catCount++;
    }

    public static int getcatCount() {
        return catCount;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                ", distswim=" + distswim +
                ", distsrun=" + distsrun +
                '}';
    }
}

