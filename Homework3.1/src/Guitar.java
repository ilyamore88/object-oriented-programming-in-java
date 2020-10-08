public class Guitar extends Player {
    protected int numberOfString;

    public Guitar() {
        numberOfString = 6;
    }

    public Guitar(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    public Guitar(String key, int numberOfString) {
        super(key);
        this.numberOfString = numberOfString;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с кол-вом струн " + numberOfString + " и нотой " + key);
    }
}
