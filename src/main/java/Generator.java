public class Generator implements Checkable {
    private double totalEnergy;

    public Generator() {
        this.totalEnergy = 0;
    }

    public double getTotalEnergy() {
        return totalEnergy;
    }

    public void setTotalEnergy(double totalEnergy) {
        this.totalEnergy = totalEnergy;
    }

    public double generateEnergy(double steam) {
        double kwh = steam * 7.0;
        this.totalEnergy += kwh;
        return kwh;
    }

    public Status getStatus() {
        Status status = Status.STABLE;
        if (this.totalEnergy > 560) {
            status = Status.UNSTABLE;
        }
        return status;
    }
}
