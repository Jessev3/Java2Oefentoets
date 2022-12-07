public class Cooling implements Checkable {
    private double waterTemp;

    public Cooling() {
        this.waterTemp = 0;
    }

    public double getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(double waterTemp) {
        this.waterTemp = waterTemp;
    }

    public void abductResidualHeat(double residualHeat) {
        this.waterTemp = residualHeat * 0.5;
    }

    public Status getStatus() {
        Status status = Status.STABLE;
        if (waterTemp > 80 && waterTemp < 90) {
            status = Status.NEEDS_ATTENTION;
        }
        if (waterTemp > 90) {
            status = Status.UNSTABLE;
        }

        return status;
    }
}
