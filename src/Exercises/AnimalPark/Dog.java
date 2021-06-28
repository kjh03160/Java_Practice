package Exercises.AnimalPark;

public class Dog extends AbstractAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void cry() {
        System.out.println("왈왈");
    }
}
