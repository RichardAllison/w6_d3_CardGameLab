import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckHasCards() {
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canRemoveAllCards() {
        System.out.println(deck.removeAllCards());
        assertEquals(0, deck.countCards());
    }
}
