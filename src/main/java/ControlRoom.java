import java.lang.reflect.Array;

public class ControlRoom {
    private Generator generator;

    private Reactor reactor;

    private Cooling cooling;

    public ControlRoom(Generator generator, Reactor reactor, Cooling cooling) {
        this.generator = generator;
        this.reactor = reactor;
        this.cooling = cooling;
    }

    public boolean isNuclearStable() {
        if (generator.getStatus() != Status.STABLE || reactor.getStatus() != Status.STABLE || cooling.getStatus() != Status.STABLE) {
            return false;
        }
        return true;
    }
}
