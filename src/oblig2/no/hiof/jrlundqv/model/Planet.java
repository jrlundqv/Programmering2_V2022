package oblig2.no.hiof.jrlundqv.model;

public class Planet {
    private String name;
    private double radius;
    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public double getMEarth() {
        return getMassInKg() / 5.972E24;
    }

    public double getSurfaceGravity() {
        return 6.67408E-11*getMassInKg()/Math.pow(getRadiusInKm()*1000,2);
    }

    public double getRadiusInKm() {
        return radius * 71492;
    }

    public double getMassInKg() {
        return mass * 1.898E27;
    }

    public String toString() {
        return name + " has a radius of " + radius + " Rjup, and a mass of " + mass + " Mjup";
    }

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
