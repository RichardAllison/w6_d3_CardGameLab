import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public int handCardCount() {
       return this.hand.size();
    }

    public int cardInHandValue() {
        int value = 0;
        for(Card card: this.hand) {
            value += card.getRank().getValue();
        }
        return value;
    }
}
