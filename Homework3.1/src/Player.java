public abstract class Player {
    protected String key;

    public Player() {
        key = "До мажор";
    }

    public Player(String key) {
        this.key = key;
    }

    public abstract void play();
}
