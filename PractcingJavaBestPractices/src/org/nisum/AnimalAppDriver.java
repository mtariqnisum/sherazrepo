package org.nisum;

import org.nisum.bl.AnimalController;
import org.nisum.dto.Cat;
import org.apache.logging.log4j.*;


public class AnimalAppDriver {
     public static Logger log;
     public static void main(String args[])
     {
          AnimalController animalController=new AnimalController("animal.txt");
          Cat cat=new Cat("Tom",12,3432423,20);
          animalController.addPetAnimal(cat);
          animalController.printAnimalList();
          log= LogManager.getLogger(AnimalAppDriver.class);
          log.info("checking log");
     }
}
