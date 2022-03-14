package no.hiof.jrlundqv.oblig4;

import no.hiof.jrlundqv.oblig4.model.Planet;
import no.hiof.jrlundqv.oblig4.model.PlanetSystem;
import no.hiof.jrlundqv.oblig4.model.Star;
import no.hiof.jrlundqv.oblig4.tools.StarCSVFileHandler;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Star sun = new Star("Sun", 1, 1, 5777);
        Star muCas = new Star("MU Cas", 4.192, 4.657, 14750);
        Star v6947 = new Star("V69-47", 1.316, 0.876, 5945);
        Star yzCas = new Star("YZ Cas", 2.547, 2.308, 9200);
        Star NGC188 = new Star("NGC188", 1.425, 1.102, 5900);
        Star zetPhe = new Star("zet Phe", 2.853, 3.922, 14550);

        ArrayList<Star> starList = new ArrayList<>();

        starList.add(sun); starList.add(muCas); starList.add(v6947); starList.add(yzCas); starList.add(NGC188); starList.add(zetPhe);

        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun);
        Planet jupiter = new Planet("Jupiter", 1, 1, 5.20440, 0.049, 4380, sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660, sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun);

        ArrayList<Planet> planetList = new ArrayList<>();

        planetList.add(mercury); planetList.add(venus); planetList.add(earth); planetList.add(mars);
        planetList.add(jupiter); planetList.add(saturn); planetList.add(uranus); planetList.add(neptune);

        PlanetSystem solarSystem = new PlanetSystem("Solar system", sun, planetList);

        StarCSVFileHandler starCSVFileHandler = new StarCSVFileHandler();
        starCSVFileHandler.writeObjectsToFile(starList, "stars.csv");

        ArrayList<Star> newStarList = starCSVFileHandler.readObjectsFromFile("stars.csv");
        for (Star star : newStarList) {
            System.out.println(star);
        }
    }
}
