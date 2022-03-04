package no.hiof.jrlundqv.oblig3;

import no.hiof.jrlundqv.oblig3.model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Star sun = new Star("Sun", 1, 1, 5777);
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

        System.out.println("\nOppgave 2.2");
        System.out.println(solarSystem.getPlanetByName("uranus"));

        System.out.println("\nOppgave 2.5");
        earth.printDistanceToCentralBody(0);
        earth.printDistanceToCentralBody(90);
        earth.printDistanceToCentralBody(180);
        earth.printDistanceToCentralBody(270);
        earth.printDistanceToCentralBody(360);

        System.out.println("\nOppgave 2.6");
        earth.printOrbitingVelocity(0);
        earth.printOrbitingVelocity(45);
        earth.printOrbitingVelocity(90);
        earth.printOrbitingVelocity(135);
        earth.printOrbitingVelocity(180);

        System.out.println("\nOppgave 3.1");
        earth.printOrbitingVelocityMetersPerSecond(90);

        System.out.println("\nOppgave 3.2");
        earth.printMinMaxDistance();

        System.out.println("\nOppgave 3.3");
        earth.printDistanceBetweenPlanets(saturn, 180);

        System.out.println("\nOppgave 3.?");
        earth.printMaxDistanceBetweenPlanets(saturn);
    }
}
