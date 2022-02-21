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

    public void printMinMaxDistance() {
        System.out.printf("%s has maximum distance of %,.0f km, and a minimum distance of %,.0f km\n"
        , getName(), maxDistanceToCentralBody(), minDistanceToCentralBody());
    }

    public void printOrbitingVelocityMetersPerSecond(double degrees) {
        System.out.printf("At a distance of %,.0f km, %s has a velocity of %.0f m/s\n"
                , distanceToCentralBody(degrees), getName(), orbitingVelocityMetersPerSecond(distanceToCentralBodyInMeters(degrees)));
    }

    public void printOrbitingVelocity(double degrees) {
        System.out.printf("At a distance of %,.0f km, %s has a velocity of %.2f km/s\n"
                , distanceToCentralBody(degrees), getName(), orbitingVelocity(distanceToCentralBodyInMeters(degrees)));
    }

    public void printDistanceToCentralBody(double degrees) {
        System.out.printf("%s has a distance of %,.0f km to the %s at %.0f degrees\n"
                , getName(), distanceToCentralBody(degrees), centralCelestialBody.getName(), degrees);
    }

    public double distanceBetweenPlanets(Planet planet) {
        return 0;
    }

    /**
     * v = sqrt(GM / r)
     * v = velocity in m/s
     * G = gravitational constant
     * M = mass of central celestial body in KG
     * r = distance to central celestial body in meters
     * @param distance distance to central celestial body in meters
     * @return orbiting velocity in km/s
     */
    public double orbitingVelocity(double distance) {
        return Math.sqrt(GRAVITY_CONSTANT * centralCelestialBody.getMassInKg() / distance) / 1000;
    }

    public double orbitingVelocityMetersPerSecond(double distance) {
        return orbitingVelocity(distance) * 1000;
    }

    public double minDistanceToCentralBody() {
        double degrees = 0;
        double degreeIncrement = 360.0 / orbitalPeriod;
        double minDistance = distanceToCentralBody(0);
        for (int i = 0; i < orbitalPeriod; i++) {
            degrees += degreeIncrement;
            if (distanceToCentralBody(degrees) < minDistance)
                minDistance = distanceToCentralBody(degrees);
        }
        return minDistance;
    }

    public double maxDistanceToCentralBody() {
        double degrees = 0;
        double degreeIncrement = 360.0 / orbitalPeriod;
        double maxDistance = distanceToCentralBody(0);
        for (int i = 0; i < orbitalPeriod; i++) {
            degrees += degreeIncrement;
            if (distanceToCentralBody(degrees) > maxDistance)
                maxDistance = distanceToCentralBody(degrees);
        }
        return maxDistance;
    }

    /**
     * r = a(1-e²) / 1 + e cos θ
     * r = distance in astronomical units (AU)
     * a = semiMajorAxis
     * e = eccentricity
     * θ = angle in radians
     * @param degrees angle between natural satellite and central celestial body
     * @return distance in km to central celestial body
     */
    public double distanceToCentralBody(double degrees) {
        return AU * (semiMajorAxis * (1 - Math.pow(eccentricity, 2)) / (1 + eccentricity * Math.cos(Math.toRadians(degrees))));
    }

    public double distanceToCentralBodyInMeters(double degrees) {
        return distanceToCentralBody(degrees) * 1000;
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
