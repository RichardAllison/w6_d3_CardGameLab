import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.CLUBS, Rank.THREE);
    }

    @Test
    public void hasSuit(){
        assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.THREE, card.getRank());
    }

    @Test
    public void hasValueOf3() {
        assertEquals(3, card.getRank().getValue());
    }

}
