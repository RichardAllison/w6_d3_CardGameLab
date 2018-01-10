import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Card card;

    @Before
    public void before() {
        player1 = new Player("Ross");
        player2 = new Player("Richard");
        card = new Card(Suit.CLUBS, Rank.ACE);
    }

    @Test
    public void hasName() {
        assertEquals("Ross", player1.getName());
    }

    @Test
    public void  canAddCard() {
        player1.addCard(card);
        assertEquals(1, player1.handCardCount());
    }

}
