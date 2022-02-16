package no.hiof.jrlundqv.oblig3.model;

public class Star extends CelestialBody{
    private int effectiveTemp;
    static final double RSUN = 695700;
    static final double MSUN = 1.98892E30;

    public Star(String name, double radius, double mass, int effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    public double getRadiusInKm() {
        return getRadius() * RSUN;
    }

    public double getMassInKg() {
        return getMass() * MSUN;
    }

    public String toString() {
        return getName() + ", Radius: " + getRadius() + ", Mass: " + getMass() + ", Eff. temp.: " + effectiveTemp;
    }

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
}
