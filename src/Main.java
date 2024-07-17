import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
        Random random = new Random();

        Deck deck = new Deck();
        ArrayList<Card> cardDeck = deck.getDeck();

        int computerChoose = random.nextInt(51);
        int playerChoose = random.nextInt(51);

        Card choosedComputerCard = cardDeck.get(computerChoose);
        Card choosedPlayerCard = cardDeck.get(playerChoose);

        System.out.println("Computador: " + choosedComputerCard.getCard());
        System.out.println("Player: " + choosedPlayerCard.getCard());

        if (choosedComputerCard.getNaipe().compareTo(choosedPlayerCard.getNaipe()) > 0) {
            System.out.println("Computador venceu!");
        } else if (choosedPlayerCard.getNaipe().compareTo(choosedComputerCard.getNaipe()) > 0) {
            System.out.println("Player venceu!");
        } else {
            if (choosedPlayerCard.getValue().compareTo(choosedComputerCard.getValue()) > 0) {
                System.out.println("Player venceu!");
            } else if (choosedPlayerCard.getValue().compareTo(choosedComputerCard.getValue()) < 0) {
                System.out.println("Computador venceu!");
            } else {
                System.out.println("Empate");
            }
        }
    }
}