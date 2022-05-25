package run;

import controller.AnimalController;
import model.Cat;

public class Driver {
     public static void main(String args[])
     {
          AnimalController animalController=new AnimalController("animal.txt");
          Cat cat=new Cat("Tom",12,3432423,20);
          animalController.addPetAnimal(cat);
          animalController.printAnimalList();
     }
}
