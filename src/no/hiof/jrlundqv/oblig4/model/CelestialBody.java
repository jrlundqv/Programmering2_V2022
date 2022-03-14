package no.hiof.jrlundqv.oblig4.model;

public abstract class CelestialBody implements Comparable<CelestialBody>{
    private String name;
    private double radius;
    private double mass;
    static final double GRAVITY_CONSTANT = 6.67408E-11;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public int compareTo(CelestialBody o) {
        return Double.compare(0, o.radius - radius);
    }

    public abstract double getRadiusInKm();

    public abstract double getMassInKg();

    public abstract String toString();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
