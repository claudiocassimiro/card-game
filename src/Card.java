public class Card {
    private Suit naipe;
    private String value;

    public Card(Suit naipe, String value) {
        this.naipe = naipe;
        this.value = value;
    }

    public String getValue () {
        return value;
    }

    public String getNaipe () {
        switch(this.naipe) {
            case Suit.PAUS:
                return "P";
            case Suit.ESPADAS:
                return "E";
            case Suit.OURO:
                return "O";
            case Suit.COPAS:
                return "C";
            default:
                return "naipe inválido";
        }
    }

    public String getCard() {
        return this.getNaipe() + this.getValue();
    }
}
