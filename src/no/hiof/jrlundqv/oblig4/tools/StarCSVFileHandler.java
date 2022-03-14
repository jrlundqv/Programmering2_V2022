package no.hiof.jrlundqv.oblig4.tools;

import no.hiof.jrlundqv.oblig4.model.Star;
import no.hiof.jrlundqv.oblig4.interfaces.FileHander;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class StarCSVFileHandler implements FileHander<Star> {

    @Override
    public void writeObjectsToFile(ArrayList<Star> starArrayList, String filePath) throws IOException {

        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.flush();

        for (Star star : starArrayList) {
            fileWriter.write(star.toCSV());
        }

        fileWriter.close();
    }

    @Override
    public ArrayList<Star> readObjectsFromFile(String filePath) throws IOException {

        ArrayList<Star> starArrayList = new ArrayList<>();
        String csvFileContent = new String(Files.readAllBytes(Path.of(filePath)));

        for (String line : csvFileContent.split("\n")) {
            String[] csvData = line.split(",");

            String name = csvData[0];
            double radius = Double.parseDouble(csvData[1]);
            double mass = Double.parseDouble(csvData[2]);
            int effectiveTemp = Integer.parseInt(csvData[3]);

            starArrayList.add(new Star(name, radius, mass, effectiveTemp));
        }
        return starArrayList;
    }
}
