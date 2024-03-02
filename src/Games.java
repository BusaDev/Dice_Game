import java.util.Arrays;

public class Games {
    private Players[] players;
    private Dice dice;

    public Games(Players[] players) {
        this.players = players;
        this.dice = new Dice();
    }

    public void play() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Lancio " + (i + 1) + ":");
            for (Players players : players) {
                int lancio = dice.trowDice();
                players.setScore(lancio);
                System.out.println("il giocatore: " + players.getNickname() + " ha ottenuto: " + lancio + " e il suo punteggio attuale è: " + players.getScore());
            }
        }
        System.out.println("");
    }

    public void scoreBoard() {
        Players placeHolder;
        for (int i = 0; i < players.length; i++) {
            placeHolder = players[i];
            for (int j = 0; j < players.length; j++) {
                if (players[i].getScore() > players[j].getScore()) {
                    players[i] = players[j];
                    players[j] = placeHolder;
                    placeHolder = players[i];
                }
            }
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("il giocatore: " + players[i].getNickname() + " ha ottenuto: " + players[i].getScore());
        }
        System.out.println("");
        System.out.println("il giocatore " + players[0].getNickname() + " ha vinto con un totale di: " + players[0].getScore() + " punti!");
    }

    public void winner() {
        int c = 0;
        for (int i = players.length - 1; i > 0; i--) {
            if (players[i].getScore() == players[i - 1].getScore()) {
                c += 1;
            }
        }
        if (c != 0) {
            spareggio(c);
        }
    }

    public void spareggio(int c) {
        for (int i = 0; i <= c; i++) {
                int lancio = dice.trowDice();
                players[i].setScore(lancio);
                System.out.println("il giocatore: " + players[i].getNickname() + " ha ottenuto: " + lancio + " e il suo punteggio attuale è: " + players[i].getScore());
        }
    }
}


