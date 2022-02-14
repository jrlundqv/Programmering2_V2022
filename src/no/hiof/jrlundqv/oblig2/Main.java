package no.hiof.jrlundqv.oblig2;

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

        System.out.println("\nOppgave 2.3");
        System.out.println(solarSystem);
        System.out.println(sun);
        System.out.println(jupiter);
        System.out.println(earth);

        System.out.println("\nOppgave 2.4");
        System.out.println("Saturn radius in KM: " + saturn.getRadiusInKm());
        System.out.println("Saturn mass in KG: " + saturn.getMassInKg());

        System.out.println("Sun radius in KM: " + sun.getRadiusInKm());
        System.out.println("Sun mass in KG: " + sun.getMassInKg());

        System.out.println("\nOppgave 2.5");
        System.out.println("Neptune surface gravity: " + neptune.getSurfaceGravity() + " m/s²");
        System.out.println("Earth surface gravity: " + earth.getSurfaceGravity() + " m/s²");

        System.out.println("\nOppgave 2.6");
        System.out.println("The biggest planet in " + solarSystem.getName() + " is " + solarSystem.getBiggestPlanet().getName());
        System.out.println("The smallest planet in " + solarSystem.getName() + " is " + solarSystem.getSmallestPlanet().getName());

        System.out.println("\nOppgave 3.1");
        System.out.println(earth.getMEarth());
    }
}
