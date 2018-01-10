import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        dealer = new Dealer();
        ArrayList<Card> cards = new ArrayList<>();
        deck = new Deck();
    }

    @Test
    public void getsCards() {
        dealer.getsCardsFromDeck(deck);
        assertEquals(52, dealer.countDealerCards());
    }

    @Test
    public void canDealCard() {
        dealer.getsCardsFromDeck(deck);
        dealer.dealCard();
        assertEquals(1, dealer.countDealerCards());
    }
}
