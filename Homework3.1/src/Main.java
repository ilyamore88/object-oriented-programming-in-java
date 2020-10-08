public class Main {
    public static void main(String[] args) {
        Player players[] = new Player[3];
        players[0] = new Guitar("Ре минор", 4);
        players[1] = new Drum(11.0);
        players[2] = new Trumpet(5.5);

        for (int i = 0; i < players.length; i++) {
            players[i].play();
        }
    }
}
