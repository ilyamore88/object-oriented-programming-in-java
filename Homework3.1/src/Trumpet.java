public class Trumpet extends Player {
    protected double diameter;

    public Trumpet() {
        diameter = 3.0;
    }

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public Trumpet(String key, double diameter) {
        super(key);
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diameter + " и нотой " + key);
    }
}
