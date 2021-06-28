package Exercises.AnimalPark;

public class Cat extends AbstractAnimal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void cry() {
        System.out.println("야옹");
    }
}
