import java.util.HashSet;

public class Reactor implements Checkable {

    private HashSet<Core> cores;
    private double steam;
    private double residualHeat;

    public Reactor() {
        this.cores = new HashSet<>();
        this.steam = 0;
        this.residualHeat = 0;
    }

    public HashSet<Core> getCores() {
        return this.cores;
    }

    public void addCore(Core core) {
        this.cores.add(core);
    }

    public double getSteam() {
        return steam;
    }

    public void setSteam(double steam) {
        this.steam = steam;
    }

    public double getResidualHeat() {
        return residualHeat;
    }

    public void setResidualHeat(double residualHeat) {
        this.residualHeat = residualHeat;
    }

    public void generateSteamAndEnergy(double temperature, int time) {
        double steam = 0;
        double residualHeat = 0;

        for (Core core : cores) {
            SplitResult splitResult = core.split(temperature, time);
            steam += splitResult.getSteam();
            residualHeat += splitResult.getResidualHeat();
        }

        this.steam = steam;
        this.residualHeat = residualHeat;
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
