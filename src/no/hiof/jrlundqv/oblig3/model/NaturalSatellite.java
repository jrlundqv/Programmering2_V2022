package no.hiof.jrlundqv.oblig3.model;

public abstract class NaturalSatellite extends CelestialBody{
    private double semiMajorAxis;
    private double eccentricity;
    private int orbitalPeriod;
    private CelestialBody centralCelestialBody;
    static final double AU = 149597871;

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, int orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public void printDistanceToCentralBody(double degrees) {
        System.out.printf("%s has a distance of %.0f km to the %s at %.0f degrees\n",
                getName(), distanceToCentralBody(degrees), centralCelestialBody.getName(), degrees);
    }

    /**
     * r = a(1-e²) / 1 + e cos θ
     * a = semiMajorAxis
     * e = eccentricity
     * θ = angle in degrees
     * @param degrees angle between natural satellite and central celestial body
     * @return distance in km to central celestial body
     */
    public double distanceToCentralBody(double degrees) {
        return AU * (semiMajorAxis * (1 - Math.pow(eccentricity, 2)) / (1 + eccentricity * Math.cos(Math.toRadians(degrees))));
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public CelestialBody getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(CelestialBody centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }
}
