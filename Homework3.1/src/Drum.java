public class Drum extends Player {
    protected double size;

    public Drum() {
        size = 3.0;
    }

    public Drum(double size) {
        this.size = size;
    }

    public Drum(String key, double size) {
        super(key);
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + size + " и нотой " + key);
    }
}
