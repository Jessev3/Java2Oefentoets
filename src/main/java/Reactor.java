import java.util.HashSet;

public class Reactor implements Checkable {

    private HashSet<Core> cores;

    public Reactor() {
        this.cores = new HashSet<>();
    }

    public HashSet<Core> getCores() {
        return this.cores;
    }

    public void addCore(Core core) {
        this.cores.add(core);
    }

    public SplitResult generateSteamAndEnergy(double temperature, int time) throws MeltdownException {
        double steam = 0;
        double residualHeat = 0;

        for (Core core : cores) {
            SplitResult splitResult = core.split(temperature, time);
            steam += splitResult.getSteam();
            residualHeat += splitResult.getResidualHeat();
        }

        return new SplitResult(steam, residualHeat);
    }

    public Status getStatus() {
        Status status = Status.STABLE;
        for (Core core : cores) {
            if (core.getRestPercentage() <= 0.2) {
                status = Status.NEEDS_ATTENTION;
            }
        }
        return status;
    }
}
