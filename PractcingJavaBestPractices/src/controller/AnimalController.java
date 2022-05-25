package controller;

import model.*;

import java.util.ArrayList;

public class AnimalController {
    private FileHandling file;
    private ArrayList<PetAnimal> catArrayList;

    public AnimalController(String path) {
        file = new FileHandling(path);
        catArrayList = new ArrayList<>();
        try {
            catArrayList=file.readData();
        } catch (AnimalException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addPetAnimal(PetAnimal petAnimal) {
        try {
            catArrayList.add(petAnimal);
            file.writeData(catArrayList);
        } catch (AnimalException e) {
            System.out.println(e.getMessage());
        }

    }

    public void printAnimalList()
    {
        for(int i=0;i<catArrayList.size();i++)
        {
            System.out.println(((Cat)catArrayList.get(i)).toString());
        }
    }

}
