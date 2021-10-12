package _07_abstractclass_interface.practice.animal_class.controller;

import _07_abstractclass_interface.practice.animal_class.animal.Animal;
import _07_abstractclass_interface.practice.animal_class.animal.Chicken;
import _07_abstractclass_interface.practice.animal_class.animal.Tiger;
import _07_abstractclass_interface.practice.animal_class.edible.Edible;
import _07_abstractclass_interface.practice.animal_class.fruit.Apple;
import _07_abstractclass_interface.practice.animal_class.fruit.Fruit;
import _07_abstractclass_interface.practice.animal_class.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat()); //could be fried
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
