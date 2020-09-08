package lesson6;

import lesson6.animals.*;

public class Main {
    public static void main(String[] args) {
        int quantityAnimal = 3 + (int) (Math.random()*5);
        for (int i = 1; i < quantityAnimal; i++) {
            Animal cat = new Cat(i, ((int) (Math.random()*330)), ((int) (Math.random()*400)));
            Animal dog = new Dog(i, ((int) (Math.random()*600)), ((int) (Math.random()*30)));
            //((Dog) dog).infodog();
            //((Cat) cat).infocat();
            dog.info("Собакен ", 500, 10);
            cat.info("Котэ ", 200, 0);
        }

        System.out.println("Количество Кошек: " + Cat.getcatCount());
        System.out.println("Количество Собак: " + Dog.getdogCount());

    }

}
