import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Card card;
    Card card2;

    @Before
    public void before(){
        dealer = new Dealer();
        ArrayList<Card> cards = new ArrayList<>();
        card = new Card(Suit.CLUBS, Rank.ACE);
        card2 = new Card(Suit.CLUBS, Rank.ACE);
        cards.add(card);
        cards.add(card2);
        deck = new Deck(cards);
    }

    @Test
    public void getsCards() {
        dealer.getsCardsFromDeck(deck);
        assertEquals(2, dealer.countDealerCards());
    }

    @Test
    public void canDealCard() {
        dealer.getsCardsFromDeck(deck);
        dealer.dealCard();
        assertEquals(1, dealer.countDealerCards());
    }
}
