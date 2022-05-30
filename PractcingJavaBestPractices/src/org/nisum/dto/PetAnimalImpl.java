package org.nisum.dto;

import org.nisum.interfaces.AnimalInterface;

public abstract class PetAnimalImpl implements AnimalInterface {

    private int health;
    private int petID;
    private String name;

    public PetAnimalImpl(String name, int health, int petID) {
        this.health = health;
        this.petID=petID;
        this.name=name;
    }

    @Override
    public void feed() {

    }

    @Override
    public boolean play() {
        return false;
    }

    public abstract boolean isInTraining();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName()+"@"+getPetID()+"@"+getHealth();
    }
}
