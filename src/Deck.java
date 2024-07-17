import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    final Suit[] naipe = {Suit.PAUS, Suit.ESPADAS, Suit.OURO, Suit.COPAS};
    final String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Deck() {
        this.deck = generateCards();
    }

    private ArrayList<Card> generateCards() {
        ArrayList<Card> cardDeck = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <= 51; i++) {
            int naipeIndex = random.nextInt(3);
            int valueIndex = random.nextInt(12);

            cardDeck.add(new Card(this.naipe[naipeIndex], this.value[valueIndex]));
        }

        return cardDeck;
    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }
}
