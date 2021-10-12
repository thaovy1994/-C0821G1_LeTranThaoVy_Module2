package _07_abstractclass_interface.practice.animal_class.animal;

import _07_abstractclass_interface.practice.animal_class.animal.Animal;
import _07_abstractclass_interface.practice.animal_class.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {              //implements from Edible interface.
        return "could be fried";
    }
}
