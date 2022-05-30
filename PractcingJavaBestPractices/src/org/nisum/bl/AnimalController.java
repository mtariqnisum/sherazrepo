package org.nisum.bl;

import org.nisum.customexception.AnimalException;
import org.nisum.dto.Cat;
import org.nisum.dto.PetAnimalImpl;
import org.nisum.utils.FileHandling;

import java.util.ArrayList;

public class AnimalController {
    private FileHandling file;
    private ArrayList<PetAnimalImpl> catArrayList;

    public AnimalController(String path) {
        file = new FileHandling(path);
        catArrayList = new ArrayList<>();
        try {
            catArrayList=file.readData();
        } catch (AnimalException e) {
            System.out.println(e.getMessage());
            // dont use sout now, use log4j2
        }
    }

    public void addPetAnimal(PetAnimalImpl petAnimal) {
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
