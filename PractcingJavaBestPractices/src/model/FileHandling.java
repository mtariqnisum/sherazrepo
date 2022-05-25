package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {

    private String path;

    public FileHandling(String path) {
        this.path = path;
    }

    public ArrayList<PetAnimal> readData() throws AnimalException {
        try {
            ArrayList<PetAnimal> petAnimalArrayList=new ArrayList<>();
            List<String> lines = Files.readAllLines(new File(path).toPath());
            for(int i=0;i<lines.size();i++)
            {
                String st[]=lines.get(i).split("@");
                petAnimalArrayList.add(new Cat(st[0],Integer.parseInt(st[1]),Integer.parseInt(st[2]),Integer.parseInt(st[3])));
            }
            return petAnimalArrayList;

        } catch (IOException e) {
            throw new AnimalException(e.getMessage());
        }

    }

    public void writeData(ArrayList<PetAnimal> list) throws AnimalException {
        try {

            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fWriter = new FileWriter(path);

            fWriter.write("");
            for (int i = 0; i < list.size(); i++) {
                fWriter.append(list.get(i).toString() + "\n");
            }

            fWriter.close();
        } catch (IOException e) {
            throw new AnimalException(e.getMessage());
        }
    }

}
