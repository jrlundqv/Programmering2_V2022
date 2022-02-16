package no.hiof.jrlundqv.oblig3;

import no.hiof.jrlundqv.oblig2.model.Planet;
import no.hiof.jrlundqv.oblig2.model.PlanetSystem;
import no.hiof.jrlundqv.oblig2.model.Star;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1, 1);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

        ArrayList<Planet> planetList = new ArrayList<>();

        planetList.add(mercury); planetList.add(venus); planetList.add(earth); planetList.add(mars);
        planetList.add(jupiter); planetList.add(saturn); planetList.add(uranus); planetList.add(neptune);

        Star sun = new Star("Sun", 1, 1, 5777);

        PlanetSystem solarSystem = new PlanetSystem("Solar system", sun, planetList);


    }
}
