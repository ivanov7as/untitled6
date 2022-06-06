import java.util.ArrayList;
import java.util.List;

public class main {

    private static AnimalType Cat;
    private static AnimalType Dog;

    public static void main(String[] args) {

        final List <Animal> animals = new ArrayList();
        animals.add(Animal.of(Cat));
        animals.add(Animal.of(Dog));

        animals.forEach(animal -> {

            System.out.println(animal.run(100));
            System.out.println(animal.swim(10));
            System.out.println(animal.jump(1));
        }
        );

    }

}