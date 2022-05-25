package model;

import model.PetAnimal;

public class Cat extends PetAnimal {
    private int age;

    public Cat(String name, int health, int petID, int age) {
        super(name, health, petID);
        this.age = age;
    }

    @Override
    public boolean isInTraining() {
        if (age < 5)
            return true;
        else return false;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  super.toString()+"@"+getAge();
    }
}
