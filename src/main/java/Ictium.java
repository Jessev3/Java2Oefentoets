public class Ictium extends Core {

    public static final int MINIMUM_KELVIN = 333;
    public static final double DECREASE_PER_SECOND = 0.00006;
    public static final double MINIMUM_DECREASE = 0.000004;

    public Ictium() {
        super();
    }

    @Override
    public SplitResult split(double temperature, int time) {
        double steam;
        double residualHeat;
        steam = 40 * temperature;
        residualHeat = (time / 0.3) * 18;

        this.updateRestPercentage(temperature, time);

        return new SplitResult(steam, residualHeat);
    }

    private void updateRestPercentage(double temperature, int time) {
        if (temperature >= MINIMUM_KELVIN) {
            this.restPercentage -= (DECREASE_PER_SECOND * temperature * time) + MINIMUM_DECREASE;
        }
    }
}
