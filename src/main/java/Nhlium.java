public class Nhlium extends Core {

    public static final double DECREASE_PER_SECOND = 0.0006;
    public static final int MINIMUM_KELVIN = 323;

    public Nhlium() {
        super();
    }

    @Override
    public SplitResult split(double temperature, int time) {
        double residualHeat;
        double steam;
        this.updateRestPercentage(time);
        if (temperature < MINIMUM_KELVIN) {
            steam = (temperature / 62) * time * 0.7;
            residualHeat = time * 5;
        } else {
            steam = 0.9 * ((temperature * 0.5) / time) * Math.sqrt(4) * time;
            residualHeat = temperature / 0.5;
        }
        return new SplitResult(steam, residualHeat);
    }

    private void updateRestPercentage(int time) {
        this.restPercentage -= DECREASE_PER_SECOND * time;
    }
}
