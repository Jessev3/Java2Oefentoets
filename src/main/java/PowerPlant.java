public class PowerPlant {
    private Generator generator;
    private Reactor reactor;
    private Cooling cooling;

    public PowerPlant(Generator generator, Reactor reactor, Cooling cooling) {
        this.generator = generator;
        this.reactor = reactor;
        this.cooling = cooling;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public Cooling getCooling() {
        return cooling;
    }

    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    public double run(double temperature, int time) {
        reactor.generateSteamAndEnergy(temperature, time);
        cooling.abductResidualHeat(reactor.getResidualHeat());
        return generator.generateEnergy(reactor.getSteam());
    }

}
