package oblig2.no.hiof.jrlundqv.model;

import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets;

    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public Planet getSmallestPlanet() {
        Planet smallestPlanet = planets.get(0);
        for (Planet planet : planets) {
            if (planet.getRadius() < smallestPlanet.getRadius())
                smallestPlanet = planet;
            else if (planet.getRadius() == smallestPlanet.getRadius())
                if (planet.getMass() < smallestPlanet.getMass())
                    smallestPlanet = planet;
        }
        return smallestPlanet;
    }

    public Planet getBiggestPlanet() {
        Planet biggestPlanet = planets.get(0);
        for (Planet planet : planets) {
            if (planet.getRadius() > biggestPlanet.getRadius())
                biggestPlanet = planet;
            else if (planet.getRadius() == biggestPlanet.getRadius())
                if (planet.getMass() > biggestPlanet.getMass())
                    biggestPlanet = planet;
        }
        return biggestPlanet;
    }

    public String toString() {
        return name + " has the star " + centerStar.getName() + " and " + planets.size() + " planets in orbit";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }
}
