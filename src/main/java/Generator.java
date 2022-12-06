public class Generator {
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
}
