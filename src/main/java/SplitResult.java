public class SplitResult {

    private double steam;
    private double residualHeat;

    public SplitResult(double steam, double residualHeat) {
        this.steam = steam;
        this.residualHeat = residualHeat;
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

    public void setResidualHeat(int residualHeat) {
        this.residualHeat = residualHeat;
    }
}
