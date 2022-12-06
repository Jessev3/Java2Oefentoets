public class Cooling {
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
}
