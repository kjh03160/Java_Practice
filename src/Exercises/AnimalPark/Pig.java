package Exercises.AnimalPark;

public class Pig extends AbstractAnimal{

    public Pig(String name) {
        super(name);
    }

    @Override
    void cry() {
        System.out.println("꿀꿀");
    }
}
