public abstract class Core {
    int restPercentage;

    public Core() {
        this.restPercentage = 100;
    }

    public int getRestPercentage() {
        return restPercentage;
    }

    public void setRestPercentage(int restPercentage) {
        this.restPercentage = restPercentage;
    }

    abstract SplitResult split(double temperature, int time) throws MeltdownException;
}
