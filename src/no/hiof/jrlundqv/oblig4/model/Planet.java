package no.hiof.jrlundqv.oblig4.model;

public class Planet extends NaturalSatellite {
    static final double RJUP = 71492;
    static final double MJUP = 1.898E27;
    static final double REARTH = 6371;
    static final double MEARTH = 5.972E24;

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, int orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    public double getREarth() {
        return getRadiusInKm() / REARTH;
    }

    public double getMEarth() {
        return getMassInKg() / MEARTH;
    }

    public double getSurfaceGravity() {
        return GRAVITY_CONSTANT * getMassInKg() / Math.pow(getRadiusInKm() * 1000, 2);
    }

    public double getRadiusInKm() {
        return getRadius() * RJUP;
    }

    public double getMassInKg() {
        return getMass() * MJUP;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Radius: " + getRadius() + ", Mass: " + getMass();
    }
}
