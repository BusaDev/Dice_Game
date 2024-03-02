import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tira dadi!");
        System.out.println("Quanti giocatori?:");
        System.out.println("Massimo 4 giocatori!");

        int numPlayer = scanner.nextInt();
        Players [] players = new Players[numPlayer];
        createPlayers(numPlayer, players);
        Games game = new Games(players);
        game.play();
        game.winner();
        game.scoreBoard();


    }
    public static Players [] createPlayers(int numPlayer, Players [] players){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numPlayer; i++){
            System.out.println("Inserisci il nome del primo giocatore: ");
            String nick = scanner.next();
            players[i] = new Players(nick);
        }
        for (int i = 0; i < numPlayer; i++) {
            System.out.println("Giocatore " + (i+1) + " :" + players[i]);
        }
        return players;
    }
}