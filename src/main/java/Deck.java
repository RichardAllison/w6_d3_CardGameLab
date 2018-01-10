import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    private Card card;
    private Card card2;


    public Deck(){
        this.cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {

            for (Rank rank : Rank.values()){
                card = new Card(suit, rank);
                this.cards.add(card);
            }


        }
//
//        card = new Card(Suit.CLUBS, Rank.ACE);
//        card2 = new Card(Suit.HEARTS, Rank.TEN);
//        cards.add(card);
//        cards.add(card2);
    }

//    public Deck(ArrayList<Card> cards){
//        this.cards = cards;
//    }


    public int countCards() {
        return cards.size();
    }

//    public void addCard(Card card) {
////        this.cards.add(card);
////    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public ArrayList<Card> removeAllCards() {
        ArrayList<Card> removedCards = new ArrayList<>();
        for(Card card: this.cards){
            removedCards.add(card);
        }
        this.cards.clear();
        return removedCards;
    }
}
