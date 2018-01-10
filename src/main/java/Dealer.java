import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private ArrayList<Card> dealerCards;

    public Dealer() {
        this.dealerCards = new ArrayList<>();
    }


    public void getsCardsFromDeck(Deck deck) {
        ArrayList<Card> deckCards = deck.removeAllCards();
        for(Card card: deckCards){
            this.dealerCards.add(card);
        }
        Collections.shuffle(this.dealerCards);
    }

    public int countDealerCards() {
        return this.dealerCards.size();
    }

    public Card dealCard(){
        Card removedCard = this.dealerCards.remove(0);
        return removedCard;
    }

}
