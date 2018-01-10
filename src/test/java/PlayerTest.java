import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Card card;
    Card card2;

    @Before
    public void before() {
        player1 = new Player("Ross");
        player2 = new Player("Richard");
        card = new Card(Suit.CLUBS, Rank.ACE);
        card2 = new Card(Suit.CLUBS, Rank.QUEEN);
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

    @Test
    public void canGetCardValue(){
        player1.addCard(card2);
        assertEquals(12, player1.cardInHandValue());
    }

}
